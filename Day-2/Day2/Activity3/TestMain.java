package com.activity3;

public class TestMain {
public static void main(String[] args) {
	Student s1 = new Student(101, "Raj", "Hyderabad", 65,67,34, 1200.0F);
	Student s2 = new Student(102, "Ravi", "Bangalore",75,67,84,1100.0F);
	Student s3 = new Student(103, "Ram", "Vizag",65,45,34,1300.50F);
	
	System.out.println("------------------------------------------");
	int t1 = s1.getTotalMarks();
	int t2 = s2.getTotalMarks();
	int t3=  s3.getTotalMarks();
	
	
	
		if((t1>t2) && (t1>t3)) {
			System.out.println("  highest marks are " + t1);
			
		}
		
		else if((t2>t1) && (t2>t3)) {
			System.out.println(" highest marks are" + t2);
			
		}
		else {
			System.out.println(" highest marks are " + t3);
			
		}
	
	//if ((s1.feePerMonth < s2.feePerMonth) &&(s1.feePerMonth < s3.feePerMonth))
	//{
	//	System.out.println(" Student3 : " + s1.studentName + " pays least monthy fee" + s1.feePerMonth);
		
	//}
	///else if ((s2.feePerMonth < s1.feePerMonth) &&(s2.feePerMonth < s3.feePerMonth))
	//{
	//	System.out.println(" Student3 : " + s2.studentName + " pays least monthy fee" + s2.feePerMonth);
		
	//}
	//else {
	//	System.out.println(" Student3 : " + s3.studentName + " pays least monthy fee" + s3.feePerMonth);
	//}
	
	System.out.println(" Student1 details---------");
	s1.display();
	s2.display();
	s3.display();
	
	
}
}
