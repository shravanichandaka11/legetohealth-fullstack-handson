package com.javabasics;

public class TestConditions {
	public static void main(String[] args) {
		int a =20;
		int b=30;
		int marks= 75;
		if(a>b) {
			System.out.println(" a is greater");
		}
		else {
			System.out.println(" b is greater");
		}
		if(marks<=65) {
			System.out.println(" B grade");
			
		}
		else if (marks>65 && marks<=75) {
			System.out.println(" A grade");
			
		}
		else if(marks<60) {
			System.out.println("fail");
			
		}
		else {
			System.out.println(" A+ grade");
		}
	}

}
