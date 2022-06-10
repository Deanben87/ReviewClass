package com.syntax.reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Entre your age");
		int age=scanner.nextInt();//user enters the number and hits the enter key 
		
		scanner.nextLine();// consumes the enter that user press after number 
		//this the way to avoid the problem when we start with INT scanner 
		
		
		System.out.println("Please Entre your name ");
		String name=scanner.nextLine();	
		
		System.out.println(age+name);
		
	}

}
