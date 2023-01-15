package com.skyline.exception;

import java.util.Scanner;

public class Launch6 {
public static void main(String []args) {
	System.out.println("shiva");
	Scanner sc =new Scanner(System.in);
	int a;
	int b;
	int result;
	try {
		a=sc.nextInt();
		b=sc.nextInt();
		result=a/b;
		System.out.println(result);
	}
	 
	catch(ArithmeticException aex) {
		System.out.println("You are not enter valid denomenator");
		
	}
	
	catch(RuntimeException rtex) {
		System.out.println("You are in parent of not checked exception");
	}
	
	
}
}
