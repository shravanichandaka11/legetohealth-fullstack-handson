package com.javabasics;

public class TestOperators {
	public static void main(String[] args) {
		int x = 20;
		int y = x++;
		System.out.println(" x= " + x+", y= " + +y);
		boolean status = x > y;
		System.out.println("status is : " +status);
		
		status = (x==y);
		System.out.println("status is : " +status);
		status = x<y;
		System.out.println("status is : " +status);
	}

}
