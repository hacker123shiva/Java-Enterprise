package com.skyline.exception;

import java.util.Scanner;

public class Launch9 {

	public static void main(String[] args) throws InvalidPriceException { //when you are using throws keyword then you have to handle exception in main method or in caller method or in caller caller method
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter product name");
			String pname=sc.nextLine();
			System.out.println("Enter price");
			int price=sc.nextInt();
			if(price<100)
			{
				throw new InvalidPriceException("InvalidPriceException - Product price invalid");
				
			}
			System.out.println("Name: "+pname);
			System.out.println("Price: "+price);
	
		}
		
//		catch(ArithmeticException e)
//		{
//			
//		}
		catch(InvalidPriceException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
