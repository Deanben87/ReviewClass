package com.Replit.Test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Please enter your favorite car make");
	        Scanner scanner=new Scanner(System.in);
	        String carModel=scanner.next();
	        String out;
	        switch (carModel){
	            case "BMW":
	                out="Your favorite car is german car";
	                break;
	            case "Toyota":
	                out="Your favorite car is japanese car";
	                break;
	            case "Maserati":
	                out="Your favorite car is italian car";
	                break;
	            default:
	                out="Your favorite car is unknown";
	        }

	        
	        System.out.println(out);
	}
	
	

}
