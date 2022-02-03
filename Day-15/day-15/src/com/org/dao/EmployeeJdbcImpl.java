package com.org.dao;
import org.springframework.stereotype.Repository;



@Repository
public class EmployeeJdbcImpl implements EmployeeDao{
	
	
	public EmployeeJdbcImpl() {
		System.out.println("EmployeJDBCImpl object created");
	}

	@Override
	public void store() {
		// TODO Auto-generated method stub
		System.out.println("store method is called inside jdbc");
	
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete method is called");
	}

	
}
