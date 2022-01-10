package com.javabasics;

public class TestArrays {
	public static void main(String[] args) {
		String[] fruits = {"apple","mango","orange"};
		int[] items = new int[5];
		// allocate memory of 5 blocks with index from 0-length-1
		items[0]= 10;
		items[1]= 20;
		items[2]= 30;
		items[3]= 40;
		items[4]= 50;
		for(int i=0; i<fruits.length; i++)
		{
			System.out.println(fruits[i]);
		}
		System.out.println(".................");
for(String fruit: fruits) {
	System.out.println(fruit);
}
for(int x: items) {
	System.out.println(x);
}
}
}