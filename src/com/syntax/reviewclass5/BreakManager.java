package com.syntax.reviewclass5;

public class BreakManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;

		while (i < 5) {
			if (i > 2) {

				break;
			}
			System.out.println("Dena is fired");
			i++;  //without i++; it will be infinite loop 
			
		}

		System.out.println("We are done looping");
	}

}
