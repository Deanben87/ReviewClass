package com.syntax.reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();//ask for the size of array
		
		String[] name=new String[size];//an array of String of that size is created
		
		for(int i=0; i<name.length; i++) {
			name[i]=scan.next();//fill the array with the input from user
		}
		System.out.println(Arrays.toString(name));//print the contents of array 
		
	}

}
