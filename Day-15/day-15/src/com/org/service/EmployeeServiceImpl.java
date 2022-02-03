package com.org.service;
import com.org.dao.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Service
public class EmployeeServiceImpl {
	
	//dependency injection way of 
	private EmployeeDao dao;

	//usually we initialize dao  uisng factory pattern 
	// Employee dao = ObjectFactory.getInstance()
	
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier (value ="employeeJdbcImpl")EmployeeDao dao) {
		this.dao=dao;
		
		System.out.println("EmployeeServiceImpl()  object created");
	
	}


//	public void setDao(EmployeeDao dao) {
//		this.dao = dao;
//	}
//	
	public void save() {
		System.out.println("save inside employee service ");
		dao.store();
	}
	
	public void remove() {
		System.out.println(" remove methods inside employee serve Impl");
		dao.delete();
	}
}
