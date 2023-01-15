// package com.skyline.exception;
import java.util.Scanner;

public class  MultipleTryVsSingleTry {

	public static void main(String[] args) {
//	Multiple try catch help in our program continuosly working after failure of one statement
	 
		 
try {	System.out.println(" welcome to skyline");
		Scanner sc=new Scanner(System.in);	
		int arr[]=new int[4];
		int res=0;
		
	try{ 
	System.out.println("Enter the first Number to divide ");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	 res=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Ohh bro! please enter non zero number");
	}
	try{System.out.println("The result is "+res);
	System.out.println("Please enter size of an array");
	int size=sc.nextInt();
    arr=new int[size];
	}
	
	catch( NegativeArraySizeException e)
	{
		System.out.println("Ohh Am i joke? Please be Positive");
	}
	
	try{System.out.println("Enter the elemnet to be added in arr");
	int elem=sc.nextInt();
	System.out.println("Enter the position at which elem has to be inserted");
	int pos =sc.nextInt();
	arr[pos]=elem;
	System.out.println(arr[pos]);}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Man? be within our limits");
	}
} 
	catch(Exception e)
	{
		System.out.println("Please give proper input");
	}

 
	}
/*
  welcome to skyline
Enter the first Number to divide 
4
Enter the second number
0
Ohh bro! please enter non zero number
The result is 0
Please enter size of an array
-3
Ohh Am i joke? Please be Positive
Enter the elemnet to be added in arr
4
Enter the position at which elem has to be inserted
2
4
 */
}

 