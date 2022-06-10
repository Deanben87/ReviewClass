package com.syntax.reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		String [] names=new String[5];//creates an empty array to store string type values
		
		//names[0]="Dean";
		//[1]="Ben";
		//[2]="Easy";			
		//[3]="jack";
		//[4]="Amine";
		//names[5] = error
		
		
		Scanner input=new Scanner(System.in);
		// take the input from the keyboard and store it on idex 0 in names array 
		/*names[1]=input.next();
		names[2]=input.next();
		names[3]=input.next();
		names[4]=input.next();
		*/
		
		
		//above code has been replaced with loop 
		for(int i=0; i<names.length; i++) {
			names[i]=input.next();
		}
		
		System.out.println(Arrays.toString(names));//print the value of array without loop 
		
		
		
		
		
		
		
		

	}

}
