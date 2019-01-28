package com.database.DAO;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.database.Model.Client;
import com.database.Model.Employee;
import com.database.Service.DBimplement;

public class employeeDAOTest {

	@Test
	public void testADDdata() {
		Employee employee = new Employee();
		Client client = new Client();
		
		employee.setEmployee_Name("Arpita");
		employee.setEmployee_Salary(35000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Dhaka");
		employee.setEmployee_ZipCode("1207");

		DBimplement db = new DBimplement();
		assertEquals(true, db.addUser(employee));

	}

	@Test
	public void testUpdateData() {
		Employee employee = new Employee();
		employee.setEmployee_Name("Kona");
		employee.setEmployee_Salary(35000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Dhaka");
		employee.setEmployee_ZipCode("1207");
		
		

		DBimplement db = new DBimplement();
		assertEquals(true, db.updateUser(employee));

	}

	@Test
	public void testDeleteData() {
		Employee employee = new Employee();
		employee.setEmployee_ID(1);
		DBimplement db = new DBimplement();
		assertEquals(true, db.deleteUser(employee));

	}
	
	@Test
	public void testGetFilteredData() throws SQLException {
		DBimplement db = new DBimplement();
		assertTrue(db.getFilteredData());
		

	}
	
	@Test
	public void testinData() throws SQLException {
		DBimplement db = new DBimplement();
		assertTrue(db.inUser());
		

	}

	@Test
	public void testjoinTable() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Client client = new Client();
		assertTrue(db.innerJoin(employee,client));
		

	}
	
	@Test
	public void testleftjoinTable() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Client client = new Client();
		assertTrue(db.leftJoin(employee,client));
		

	}

	
	@Test
	public void testrightjoinTable() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Client client = new Client();
		assertTrue(db.rightJoin(employee,client));
		

	}

	
	@Test
	public void testfulljoinTable() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Client client = new Client();
		assertTrue(db.fullJoin(employee,client));
		

	}
	
	@Test
	public void testselfjoinTable() throws SQLException {
		DBimplement db = new DBimplement();
		Employee employee = new Employee();
		Client client = new Client();
		assertTrue(db.selfJoin(employee,client));
		

	}
	
	@Test
	public void testbetweenData() {
		Employee employee = new Employee();
		employee.setEmployee_ID(1);
		DBimplement db = new DBimplement();
		assertEquals(true, db.betweenUser(employee));

	}
	
	@Test
	public void testaliasesData() {
		Employee employee = new Employee();
		employee.setEmployee_ID(1);
		DBimplement db = new DBimplement();
		assertEquals(true, db.aliasesUser(employee));

	}
	
	
}
