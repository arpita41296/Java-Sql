package com.database.DAO;

import java.sql.ResultSet;
import java.util.List;

import com.database.Model.Client;
import com.database.Model.Employee;

public interface employeeDAO {
	
	boolean addUser(Employee user);

	boolean updateUser(Employee user);

	boolean deleteUser(Employee user);
	
	boolean inUser();

	Employee getUser(int userId);
	
	//ResultSet getData(); 
	
	boolean getFilteredData();
	boolean innerJoin(Employee user, Client client);
	boolean leftJoin(Employee user, Client client);
	boolean rightJoin(Employee user, Client client);
	boolean fullJoin(Employee user, Client client);
	boolean selfJoin(Employee user, Client client);
	boolean betweenUser(Employee user);
	boolean aliasesUser(Employee user);


}
