 

 

import java.util.Scanner;

public class  Launchex4Solution {

	public static void main(String[] args) {
	
	try{System.out.println(" welcome to skyline");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first Number to divide ");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	int res=a/b;
 /*
   welcome to skyline
Enter the first Number to divide 
4
Enter the second number
0
Ohh bro! please enter non zero number
  */
	System.out.println("The result is "+res);
	System.out.println("Please enter size of an array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	 /*
	  Please enter size of an array
-1
Man? be in our limits

	  */
	System.out.println("Enter the elemnet to be added in arr");
	int elem=sc.nextInt();
	System.out.println("Enter the position at which elem has to be inserted");
	int pos =sc.nextInt();
	arr[pos]=elem;}
	/*
	 Please enter size of an array
2
Enter the elemnet to be added in arr
2
Enter the position at which elem has to be inserted
5
Ohh Am i joke? Please be Positive
	 */
	catch(ArithmeticException e)
	{
		System.out.println("Ohh bro! please enter non zero number");
	}
    
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Ohh Am i joke? Please be Positive");
	}

	catch(NegativeArraySizeException e)
	{
		System.out.println("Man? be within our limits");
	}
	
	catch(Exception e)
	{
		System.out.println("Please give proper input");
	}
	}

}

 