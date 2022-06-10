package com.syntax.reviewclass3;

public class IfElse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country = "Pakistan";
		String capital ;
		
		switch (country) {

		case "Turkey":
			capital="Ankara";
			break;
		case "USA":
			capital="DC";
			break;
		case "Serbia":
			capital="Belgrade";
			break;
		case "Albania":
			capital="Tirana";
			break;
		case "Afganistan":
		 capital="Kabul";
			break;
		case "Pakistan":
		capital ="Islamaba";
			break;
			default:
				capital="Either country is included correct or its not a country";

		}
System.out.println(capital);
	}

}
