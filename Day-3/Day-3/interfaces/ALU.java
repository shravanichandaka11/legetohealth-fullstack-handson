package com.activity.day3.interfaces;

public  class ALU implements ArithmeticOpearations,LogicalOperations{
	
	
	

	@Override
	public void or() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void not() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int x=3;
		int y=4;
		int z;
		
		z= x*y;
		System.out.println(" MUl is " +z);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	


	@Override
	public void add() {
		// TODO Auto-generated method stub
	int x=3;
	int y=4;
	int z;
	
	z= x+y;
	System.out.println(" z is " +z);
	}



	@Override
	public void and() {
		// TODO Auto-generated method stub
		boolean a=true;
		boolean b=false;
		boolean c;
		c= a & b;
		System.out.println(" c is "+ c);
	}
	
	

}
