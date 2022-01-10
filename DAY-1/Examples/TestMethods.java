package com.javabasics;

public class TestMethods {
	public static void main(String[] args) {
		
		test();
		System.out.println("------------");
		user("Shravani");
		 int n = add(5,4);
		 System.out.println( n);
		Utility.demo();
		String str = Utility.hello(10);
		System.out.println(str);
	}
	public static void test() {
		System.out.println(" test method is called");
	}
	public static void user (String name) {
		System.out.println(" Hello " + name);
		
	}
	public static int add(int x, int y) {
		int result = x+y;
		System.out.println(" result = " +result );
		return result;
	}
}
