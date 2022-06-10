package com.syntax.reviewclass2;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);//it allows you to take the input from the keyboard
		System.out.println("Please entre your Account balance");
		double accountBalance=scanner.nextDouble();
		System.out.println("Please entre the amount that you want to lend to your friend");
		double amountToLend=scanner.nextDouble();
				
				if (accountBalance>=amountToLend) {
					System.out.println("Yes i can help you");
				}else {
					System.out.println("Sorry idont have enough money to help you ");
				}
		
	}

}
