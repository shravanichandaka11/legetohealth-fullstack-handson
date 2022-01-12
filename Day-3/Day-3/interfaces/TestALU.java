package com.activity.day3.interfaces;

public class TestALU extends ALU{
	public static void main(String[] args) {
		
		TestALU ta =new TestALU();
		
		ArithmeticOpearations ao;
		LogicalOperations lo;
		
		ALU al1 = new ALU();
		ALU al2 = new ALU();
	    displayArithmetic(al1);
	    displayLogical(al2);
	    
	    // accessing methods from super class;
	    ta.mul();
	    
		
	}
	public static void displayArithmetic(ArithmeticOpearations ao) {
		ao.add();
		
		
		
	}
	public static void displayLogical(LogicalOperations lo) {
		lo.and();
		
		
	}
	

}
