package com.syntax.reviewclass3;

public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Monday";
		if(day.equals("Monday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Tuesday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Wednesday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Thursday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Friday")) {
			System.out.println("Weekday");
		}
		if(day.equals("Saturday")) {
			System.out.println("Weekdend");
			
			if(day.equals("Sunday")) {
				System.out.println("Weekend");
			}
		}
		
	}

}
