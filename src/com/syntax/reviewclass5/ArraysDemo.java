package com.syntax.reviewclass5;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//should create an array
		
		String name="Dean";
		String name2="King";
		String name3="ben";
		
		
		//should not create an array
		String city="New york";
		String country="USA";
		String continent="America";
		
		String [] names={"Dean","Ben","Amine"};
		
		//95% of the times you guys will use this approach
		
		String [] names2=new String[3];//creates an empty array
		names2[0]="Dean";//stores Dean on first position 
		names2[1]="Ben";
		names2[2]="Amine";
		
		
		

	}

}
