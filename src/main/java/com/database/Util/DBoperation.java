package com.database.Util;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.database.Model.Client;
import com.database.Model.Employee;

public class DBoperation {

	public void addData(Employee user) throws SQLException {

		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String insertData = "INSERT INTO [dbo].[Arpita2]"
				+ "(Employee_Name,Employee_Salary,Employee_Country, Employee_City,Employee_ZipCode) VALUES"
				+ "(?,?,?,?,?)";

		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertData);

		preparedStatement.setString(1, user.getEmployee_Name());
		preparedStatement.setInt(2, user.getEmployee_Salary());
		preparedStatement.setString(3, user.getEmployee_Country());
		preparedStatement.setString(4, user.getEmployee_City());
		preparedStatement.setString(5, user.getEmployee_ZipCode());
		preparedStatement.execute();
		

	}

	public void updateData(Employee user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String updateData = "UPDATE [dbo].[Arpita2]"
				+ "SET Employee_Name = ?, Employee_Salary = ?, Employee_Country=?, Employee_City=?,"
				+ "Employee_ZipCode=? WHERE Employee_ID = ?";

		PreparedStatement preparedStatement = dbConnection.prepareStatement(updateData);

		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.setString(2, user.getEmployee_Name());
		preparedStatement.setInt(3, user.getEmployee_Salary());
		preparedStatement.setString(4, user.getEmployee_Country());
		preparedStatement.setString(5, user.getEmployee_City());
		preparedStatement.setString(6, user.getEmployee_ZipCode());
		preparedStatement.execute();

	}

	public void deleteData(Employee user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String deleteData = "DELETE [dbo].[Arpita2] WHERE Employee_ID = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteData);
		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.execute();

	}

	public boolean getFilteredData(Employee user) throws SQLException {
		
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		//String getData = "SELECT * FROM [dbo].[Employee_Sanzida1] WHERE Employee_ID=?";
		String str="T%";
		String getLikeData = "SELECT Employee_Name FROM [dbo].[Arpita2] WHERE Employee_Name LIKE ?;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		
		preparedStatement.setString(1,"str");
		preparedStatement.execute();
		
		//ResultSet rs_cust3 = preparedStatement.executeQuery();
		//ResultSetMetaData rsmd=rs_cust3.getMetaData();
		
		return preparedStatement.execute();

	}
public boolean inData(Employee user) throws SQLException {
		
		
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();

		//String getData = "SELECT * FROM [dbo].[Employee_Sanzida1] WHERE Employee_ID=?";
		String str="Arpita";
		String getLikeData = "SELECT Employee_Name FROM [dbo].[Arpita2] WHERE Employee_Name IN ?;";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		
		preparedStatement.setString(1,"str");
		preparedStatement.execute();
		
		//ResultSet rs_cust3 = preparedStatement.executeQuery();
		//ResultSetMetaData rsmd=rs_cust3.getMetaData();
		
		return preparedStatement.execute();

	}

public boolean joinTable(Employee user,Client client) throws SQLException {
	
	
	DBConnection conn = DBConnection.getInstance();
	Connection dbConnection = conn.getConnection();

	//String getData = "SELECT * FROM [dbo].[Employee_Sanzida1] WHERE Employee_ID=?";
	
	String getjoinData = "SELECT  \n" + 
		    "Client_Name FROM [dbo].[Arpita1] \n" + 
		    "INNER JOIN [dbo].[Arpita2] ON [dbo].[Arpita1].Employee_ID = [dbo].[Arpita1].Employee_ID;";
		  
		  PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
		  return preparedStatement.execute();
	
	

}

public boolean leftjoinTable(Employee user, Client client) throws SQLException {
	  
	  DBConnection conn = DBConnection.getInstance();
	  Connection dbConnection = conn.getConnection();
	  
	  String getjoinData = "SELECT  \n" + 
	    "Client_Name FROM [dbo].[Arpita1] \n" + 
	    "LEFT JOIN [dbo].[Arpita2] ON [dbo].[Arpita1].Employee_ID = [dbo].[Arpita2].Employee_ID;";
	  
	  PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
	  return preparedStatement.execute();
	  
	 }

public boolean rightjoinTable(Employee user, Client client) throws SQLException {
	  
	  DBConnection conn = DBConnection.getInstance();
	  Connection dbConnection = conn.getConnection();
	  String getjoinData = "SELECT  \n" + 
			    "Client_Name FROM [dbo].[Arpita1] \n" + 
			    "RIGHT JOIN [dbo].[Arpita2] ON [dbo].[Arpita1].Employee_ID = [dbo].[Arpita2].Employee_ID;";
	  
	  PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
	  return preparedStatement.execute();
	  
	 }

public boolean fulljoinTable(Employee user, Client client) throws SQLException {
	  
	  DBConnection conn = DBConnection.getInstance();
	  Connection dbConnection = conn.getConnection();
	  
	  String getjoinData = "SELECT  \n" + 
	    "[dbo].[Arpita1].Client_Name \n" + 
	    "FULL OUTER JOIN [dbo].[Arpita1] ON [dbo].[Arpita2].Employee_ID = [dbo].[Arpita1].Employee_ID "
	    + "ORDER BY [dbo].[Arpita1].Name;";
	  
	  PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
	  return preparedStatement.execute();
	  
	 }
	 public boolean selfjoinTable(Employee user, Client client) throws SQLException {
	  
	  DBConnection conn = DBConnection.getInstance();
	  Connection dbConnection = conn.getConnection();
	  
	  String getjoinData = "SELECT  \n" + 
	    "[dbo].[Arpita1].Name \n" + 
	    "FULL OUTER JOIN [dbo].[Arpita1] ON [dbo].[Arpita2].Employee_ID = [dbo].[Arpita2].Employee_ID "
	    + "ORDER BY [dbo].[Arpita1].Name;";
	  
	  PreparedStatement preparedStatement = dbConnection.prepareStatement(getjoinData);
	  return preparedStatement.execute();
	  
	 } 
	 public boolean betweenData(Employee user)  throws SQLException{
		  DBConnection conn = DBConnection.getInstance();
		  Connection dbConnection = conn.getConnection();
		  
		  String getLikeData = "SELECT Employee_Name \n" + 
		    "FROM [dbo].[Arpita2]\n" + 
		    "WHERE Employee_ID BETWEEN ? AND ?;";
		  
		  
		  PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		  
		  preparedStatement.setInt(2, 3);
		  preparedStatement.setInt(3, 4);
		  
		  return preparedStatement.execute();
		 }
	 
	 public boolean aliasesData(Employee user)  throws SQLException{
		  DBConnection conn = DBConnection.getInstance();
		  Connection dbConnection = conn.getConnection();
		  
		  String getLikeData = "SELECT Employee_Name AS ? FROM [dbo].[Arpita2] WHERE Employee_Name LIKE ?;";
		  
		  PreparedStatement preparedStatement = dbConnection.prepareStatement(getLikeData);
		  
		  preparedStatement.setString(1,"Name");
		  preparedStatement.execute();
		  
		  //ResultSet rs_cust3 = preparedStatement.executeQuery();
		  //ResultSetMetaData rsmd=rs_cust3.getMetaData();
		  
		  return preparedStatement.execute();
		 }


}
