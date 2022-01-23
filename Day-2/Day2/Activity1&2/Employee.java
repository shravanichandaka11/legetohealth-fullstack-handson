package com.basics.oops.inheritance;

public class Employee extends Person{

	private int empId;
	private double salary;
	public Employee(int empId, String name, String gender, double salary) {
		super(name, gender);
		this.empId =empId;
		this.salary = salary;
		System.out.println(" Employee constructor called");		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

//public void printInfo() {
	//super.printInfo();
	//System.out.println("Employee info" +empId+ ", "+ salary);
//}
@Override
public void display() {
	super.display();
	System.out.println("employee info " + empId  + "Salary " + salary);
	
}
}
