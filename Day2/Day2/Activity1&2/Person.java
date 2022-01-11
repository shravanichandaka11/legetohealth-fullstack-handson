package com.basics.oops.inheritance;

public class Person {
	private String name;
	private String gender;
	public Person() {
		
	}
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//public void printInfo() {
	///System.out.println("Person info" + name + ", " + gender);
//}
public  void display() {
	System.out.println(" Name- " + name + ", Gender-  " + gender);
}
}
