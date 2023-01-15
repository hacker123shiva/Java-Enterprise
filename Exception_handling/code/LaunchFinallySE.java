class Demo1
{
	void disp()
	{
		try
		{
		System.out.println("Method started");
		System.exit(0);
		}
		finally {
		System.out.println("Method ending");
		}
	}
}
public class LaunchFinallySE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo1 d=new Demo1();
        d.disp();
	}

}

//Note: finally block is not executed if we use System.exit(0) because System.exit(0) terminates the program abruptly and finally block is not executed in this case
