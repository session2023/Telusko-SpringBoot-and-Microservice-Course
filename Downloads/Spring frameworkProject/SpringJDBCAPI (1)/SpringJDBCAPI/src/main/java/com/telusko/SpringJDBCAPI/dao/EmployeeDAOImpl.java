package com.telusko.SpringJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDAOImpl implements IEmployeePersistency
{

	private static final String SQL_QUERY = "SELECT * FROM employee";

	List<Employee> employes;
	
	@Autowired
	private DataSource dataSource;
	
	
	
	public EmployeeDAOImpl() 
	{
		super();
		System.out.println("Employee DAO bean is created");
	}



	@Override
	public List<Employee> getEmployeesData() 
	{
		
		try 
		{
			Connection connection=dataSource.getConnection();//connection from HikariCP
			System.out.println("Connection  name from hikari"+connection.getClass().getName());
			PreparedStatement pstmt = connection.prepareStatement(SQL_QUERY);
			ResultSet rs = pstmt.executeQuery();
			employes=new ArrayList();
//			rs.next();
//			Integer i=rs.getInt(1);
//			Employee emp=new Employee();
//			emp.setId(i);
			
			
			while(rs.next())
			{
				Employee emp=new Employee();
				
				emp.setId(rs.getInt(1));
				
				emp.setCity(rs.getString(2));
				emp.setName(rs.getString(3));
				emp.setSalary(rs.getDouble(4));
				
				employes.add(emp);
				
				
			}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return employes;
	}

}
