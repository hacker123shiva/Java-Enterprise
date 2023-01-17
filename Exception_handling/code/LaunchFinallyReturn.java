class Demo
{
	int disp()
	{
		try
		{
		System.out.println("Method started");
		return 10;
		}
		finally {
		System.out.println("Method ending");
		}
	}
}
public class LaunchFinallyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.disp();

	}

}

//note : finally block is always executed even if there is a return statement in try block  because finally block is executed after try block and before return statement 