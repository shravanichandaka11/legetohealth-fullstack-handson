package com.basics.oops.inheritance;

public class Student extends Person {
int rollno;
String grade ;
public  Student(int rollno, String grade, String name, String gender)
{
	super(name, gender);
	this.grade =grade;
	this.rollno = rollno;
	System.out.println(" Student constructor called ");
}
@Override

	public void display() {
		
		System.out.println(" Rollno- " + rollno );
		super.display();
		System.out.println(" Grade-  " + grade);
	
	}
}
