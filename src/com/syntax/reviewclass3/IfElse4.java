package com.syntax.reviewclass3;

public class IfElse4 {

	public static void main(String[] args) {
		//when multiple if else if conditions result in same 
		//output then we can replace if else if contents with logical || operator
		
		
		String country="Turkey";
		
		if("Turkey".equals(country)) {
			System.out.println("Ankara");
		}else if("USA".equals(country)) {
			System.out.println("DC");
		}else if("Serbia".equals(country)) {
			System.out.println("Belgrade");
		}else if("Albania".equals(country)) {
			System.out.println("Tirana");
		}else if("Afganistan".equals(country)) {
			System.out.println("Kabul");
		}else if("Pakistan".equals(country)) {
			System.out.println("Islamaba");
		}
		

	}

}
