package com.basics;

public class Activity4 {
	public static void main(String[] args) {
		int sum = sumOf(9,4,3);
		System.out.println( " teh sum of largest and smallest numbers is : " + sum);
	}

	public static int sumOf(int a, int b, int c)
	 {
		 if(((a>b)&& (a>c)) && (b>c)){
			 return a+c;
		 }
		 else if(((c>b)&& (a<c)) && (b>a)){
			 return a+c;
		 }
		 
		 else
			 return b+c;
		 }
		 
	 }

