package com.oops.abstraction;
interface Vehicle{
	void mileage();
	void wheels();
}
abstract class Bike implements Vehicle{
	public void wheels() {
		System.out.println("bike has 2 wheels");
	}
}
 class pulsar extends Bike {
	public void mileage() {
		System.out.println("pulsar mileage is 35KMPL");
	}
}
 
 class ktm extends Bike {
		public void mileage() {
			System.out.println("ktm mileage is 30KMPL");
		}
	}
 
abstract class Car implements Vehicle{
		public void wheels() {
			System.out.println("car has 4 wheels");
		}
	}
	 class Swift extends Car {
		public void mileage() {
			System.out.println("pulsar mileage is 25KMPL");
		}
	}
	 
	 class Ferrari extends Car {
			public void mileage() {
				System.out.println("ktm mileage is 10KMPL");
			}
		}
public class TestAbstraction {
public static void main(String[] args) {
	pulsar p = new pulsar();
	ktm k =new ktm();
	ui(p);
	ui(k);
	Swift s = new Swift();
	Ferrari f =new Ferrari();
	ui(s);
	ui(f);
}
public static void ui(Vehicle v) {
	v.mileage();
	v.wheels();
	System.out.println("--------");
}
}
