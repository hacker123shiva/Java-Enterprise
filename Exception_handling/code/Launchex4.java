 

import java.util.Scanner;

public class Launchex4 {

	public static void main(String[] args) {
	System.out.println(" welcome to skyline");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first Number to divide ");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	int res=a/b;
/*
	 welcome to skyline
Enter the first Number to divide 
5
Enter the second number
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.skyline.exception.Launchex4.main(Launchex4.java:14)

	 */
	System.out.println("The result is "+res);
	System.out.println("Please enter size of an array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	/*
	 Please enter size of an array
-2
Exception in thread "main" java.lang.NegativeArraySizeException: -2
	at com.skyline.exception.Launchex4.main(Launchex4.java:28)

	 */
	System.out.println("Enter the elemnet to be added in arr");
	int elem=sc.nextInt();
	System.out.println("Enter the position at which elem has to be inserted");
	int pos =sc.nextInt();
	arr[pos]=elem;
	/*
	 Please enter size of an array
5
Enter the elemnet to be added in arr
4
Enter the position at which elem has to be inserted
7
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
	at com.skyline.exception.Launchex4.main(Launchex4.java:40)

	 */

	}

}

 