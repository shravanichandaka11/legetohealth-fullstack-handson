package com.basics;

public class Activity3 {
	public static void main(String[] args) {
	int x =	largest(5,9,1);
	System.out.println( " The largest of the three numbers is : " + x);	
	}
 public static int largest(int a, int b, int c)
 {
	 if((a>b) && (a>c)) {
		 return a;
	 }
	 else if ((b>a) && (b>c)) {
		 return b;
		 	 }
	 else 
		 return c;
	 
 }
}
