 

import java.util.Scanner;

public class Launch2 {

	public static void main(String[] args) {
		try {Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your name");
			String name=sc.nextLine();
			int a=sc.nextInt();
			System.out.println("Enter your college name");
			String coll =sc.nextLine();
			System.out.println("My name is "+name+" and my college name is "+coll);
		
		}
catch(Exception e)
		{
	System.out.println(e);
		}
	}

}
