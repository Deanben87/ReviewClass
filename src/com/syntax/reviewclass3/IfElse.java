package com.syntax.reviewclass3;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user="Dean";
		String password="pass123";
		//when ever we use primitive like byte short int long float double char boolean 
		//we use==
		//whenever we use non-primitive data type we use .equals method
		
		if(user.equals("dean")&& password.equals("pass123")) {
			System.out.println("Welcome to syntax");
			
		}else {
			System.out.println(" username or password is not correct");
		}
		//when Debugging make sure 
		//you have not disable the breakpoint
		//you have not enabled the skip all breakpoints option in debug window
		
		
	}

}
