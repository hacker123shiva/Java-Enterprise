package com.skyline.exception;

public class Launch7 {

	public static void main(String[] args) throws NullPointerException {
 
try {//below the throw you cannot mention anything if this is user defined handled exception
	throw new NullPointerException();
	// System.out.println("test");
}
catch(NullPointerException npe) {
	System.out.println("test");
 
}
catch(ArithmeticException aex){
//	exception handling code
	 
}

System.out.println("shiva srivastava");
	}

}
