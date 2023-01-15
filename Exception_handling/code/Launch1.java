package com.skyline.exception;

import java.util.Scanner;

public class Launch1 {
	public static void main(String []args) {
try {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	System.out.println("Enter second  number");
	int num2=sc.nextInt();
	
	int res=num1/num2;
	
	System.out.println("i am in out");
}
 
catch(Exception e)
{
	System.out.println("Error handled");
}

	}
}
