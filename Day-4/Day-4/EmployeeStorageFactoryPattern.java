package com.activity;

public class EmployeeStorageFactoryPattern {

	public EmployeeStorage getEmployeeImpl(int value) {
		if (value == 1) {
			
			return new EmployeeStorageArrayListImpl();
		} else if (value == 2) {
			
			return new EmployeeStorageHashsetImpl();
		}else if(value ==3) {
			
			return new EmployeeStorageTreeSetImpl();
		}
		return null;

	}

}
