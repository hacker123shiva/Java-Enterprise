// package com.skyline.exception;

import java.util.Scanner;

class Alpha1{
	public void divison() {
		System.out.println("Welcome to skyline ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int res=a/b;
		System.out.println("The result is "+res);
		System.out.println("Thank you for using my application");
	}
}

class Beta1{
	public void disp() {
		Alpha1 a =new Alpha1();
		a.divison();
	}
}
public class Launchex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Beta1 b=new Beta1();
	b.disp();
    
	}

}
