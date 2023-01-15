package com.skyline.exception;

public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int x=1/0;
}

catch(Exception e) {
	System.out.println(e);
	e.printStackTrace();
	System.out.println(e.getMessage());
}
	}

}
