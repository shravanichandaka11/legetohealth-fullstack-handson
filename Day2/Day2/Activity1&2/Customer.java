package com.basics.oops.inheritance;

public class Customer extends Person {
	int custId;
	long accNum;
	long balance;
	
	public Customer(int custId, long accNum,long balance, String name, String gender) {
		super(name,  gender);
		this.custId =custId;
		this.accNum = accNum;
		this.balance = balance;
		System.out.println(" Customer constructor called ");
	}
	@Override

		public void display() {
			//super.display();
			System.out.println(" Customer ID- " + custId);
			super.display();
			System.out.println(", Account Number-  " + accNum + ", Balance- " + balance);
			
		}

}
