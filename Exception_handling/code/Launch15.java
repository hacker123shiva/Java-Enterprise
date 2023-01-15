   

public class Launch15 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
int x,y;
System.out.println("shiva handled");
try {
	x=(Integer)null;
	y=(Integer)null;
	System.out.println("Product: "+x*y);
	 throw new Exception();
}

catch(ArithmeticException e)
{
	System.out.println("ERROR");
	 
}
	}

}
