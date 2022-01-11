package com.activity3;

public class Student {
private int studenttId;
 private String studentName;
private String city;
private int marks1;
private int marks2;
private int marks3;
private float feePerMonth;
boolean isEligibleForScholarship;

public Student(int studentId, String studentName, String city, int marks1, int marks2, int marks3,float feePerMonth) {
	this.feePerMonth=feePerMonth;
	this.marks1=marks1;
	this.marks2=marks2;
	this.marks3=marks3;
	this.city =	city;
	this.studenttId = studentId;
	this.studentName = studentName;
	
}

public int getMarks1() {
	return marks1;
}

public void setMarks1(int marks1) {
	this.marks1 = marks1;
}

public int getMarks2() {
	return marks2;
}

public void setMarks2(int marks2) {
	this.marks2 = marks2;
}

public int getMarks3() {
	return marks3;
}

public void setMarks3(int marks3) {
	this.marks3 = marks3;
}

public int getStudenttId() {
	return studenttId;
}
public void setStudenttId(int studenttId) {
	this.studenttId = studenttId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}



public float getAnnualFee() {
	return feePerMonth * 12;
	
}
public int getTotalMarks() {
	return marks1+marks2+marks3;
	
}

public float getAverage() {
	
	return (marks1+marks2+marks3)/3;
	
}
public void  getResult() {
	if((marks1<60) || (marks2 <60) || (marks3 <60)) {
		isEligibleForScholarship = false ;
		System.out.println(" Student is not eligible for Scholarship");
		
	}
	else {
		isEligibleForScholarship = true ;
		System.out.println(" Student is  eligible for Scholarship");
	}
	
}

	

public void display() {
	System.out.println(" Student Name " + studentName);
	System.out.println(" STudent Total Marks : " + getTotalMarks()  );
	System.out.println(" STudent Average Marks : "+ getAverage() );
	getResult();
	
}
}

