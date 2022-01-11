package com.basics.oops.inheritance;

public class TestInheritance {
public static void main(String[] args) {
	Person p1 = new Person ("Alex", "Male");
	p1.display();
	
	System.out.println(".............");
	Employee e1 = new  Employee(100, "mary", "Female", 34000);
	e1.display();
	Student s = new Student(11, "A", "Sita", "Female");
	s.display();
	Customer c =new Customer(1234, 57267575,45000,  "Raj", "Male");
	c.display();
	
}
}
