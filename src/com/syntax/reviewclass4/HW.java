package com.syntax.reviewclass4;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan=new Scanner(System.in);
		double accumulatedAmount=0;
		
		double amountToPayOff;
		do {
		
		
		System.out.println("Enter the item name that you want to buy");
		String itemName=scan.next();
		System.out.println("Enter the price item");
		double itemPrice=scan.nextDouble();
		accumulatedAmount=accumulatedAmount+itemPrice;
		System.out.println("Please enter the money");
		double money=scan.nextDouble();
		 amountToPayOff=money-accumulatedAmount;//60-100=-40
		 if(amountToPayOff<0) {
		System.out.println("Amount to pay off "+(-1*amountToPayOff));
		 }
		}
		while(amountToPayOff<0);
		System.out.println("Here is your chnage "+amountToPayOff+"Thank you");
		
		
		
		
		
		
		

	}

}
