package com.javabasics;
import java.util.Scanner;
public class TestKbInput {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter any number");
	int num = scan.nextInt();
	System.out.println(" enter any double value");
	double db = scan.nextDouble();
	System.out.println("enter any string");
	scan.nextLine();
	String str = scan.nextLine();
	System.out.println("integer value " + num +", double value " + db +", string is : "+ str);
}
}
