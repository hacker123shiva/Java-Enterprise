import java.util.Scanner;

class Alpha
{
	void alpha() throws ArithmeticException
	{
		System.out.println("Connection to Calc app is established");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		
		System.out.println("The res is "+ res);
		System.out.println("Connection is terminated");	
	}
}

class Beta
{
	void beta() throws ArithmeticException
	{
		Alpha a=new Alpha();
		a.alpha();
	}
}
public class LaunchException4 {

	public static void main(String[] args) 
	{
		// try
		// {
		Beta b=new Beta();
		b.beta();
		// }
		// catch(ArithmeticException e)
		// {
			// System.out.println(e.getMessage());
			System.out.println("Exception finally handled in main");
		// }

	}

}

/*
 when no try catch to handle the exception
 Enter the first num to divide
5
Enter the 2nd num to divide
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Alpha.alpha(LaunchException4.java:15)
        at Beta.beta(LaunchException4.java:27)
        at LaunchException4.main(LaunchException4.java:37)

then if no where to handle the exception then it will be handled by JVM 
and JVM will terminate the program abruptly and default exception handler handles the exception

 */