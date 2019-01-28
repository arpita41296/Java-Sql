package com.database.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.database.DAO.employeeDAO;
import com.database.Model.Client;
import com.database.Model.Employee;
import com.database.Util.DBoperation;

public class DBimplement implements employeeDAO {

	@Override
	public boolean addUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.addData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean updateUser(Employee user) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.updateData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.deleteData(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean inUser() {
		return true;
	}


	@Override
	public Employee getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getFilteredData() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean innerJoin(Employee user, Client client) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.joinTable(user,client);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean leftJoin(Employee user, Client client) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.leftjoinTable(user,client);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean rightJoin(Employee user, Client client) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.rightjoinTable(user,client);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean fullJoin(Employee user, Client client) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.fulljoinTable(user,client);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean selfJoin(Employee user, Client client) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.selfjoinTable(user,client);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean betweenUser(Employee user) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.betweenData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean aliasesUser(Employee user) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.aliasesData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
