 

import java.util.Scanner;

class Division{
	public void div(){
		//try {
		System.out.println("Welcome to divisionn performing application");
		Scanner scan =new Scanner (System.in);
		System.out.println("enter the first Number to divide");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int res=a/b;
		System.out.println("The result is "+ res);
	    
	//}

	//catch(Exception e) {
//		System.out.println("Please provide non zero denominator");
		
	//}

	System.out.println("Thank You for using our application");
		
	}
}

public class LaunchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Division obj =new Division();
obj.div();
	}

}
