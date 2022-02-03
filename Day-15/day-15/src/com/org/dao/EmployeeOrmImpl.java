package com.org.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class EmployeeOrmImpl  implements EmployeeDao{
	public EmployeeOrmImpl() {
		
		System.out.println("EmployeeOrmImpl() object creted  ");
	}
	@Override
	public void store() {
		// TODO Auto-generated method stub
		System.out.println("store called in Orm Impl");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete called from ORm iMpl");
	}
	

}
