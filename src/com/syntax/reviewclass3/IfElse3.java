package com.syntax.reviewclass3;

public class IfElse3 {

	public static void main(String[] args) {
		
		
		String day="Satuday";
		
		if(day.equals("Monday")||"Tuesday".equals(day)|| 
				"Wednesday".equals(day)||"Thursday".equals(day)||"Friday".equals(day))
		{System.out.println("Weekday");
}else if ("Saturday".equals(day)||"Sunday".equals(day)) {
	System.out.println("Weekend");
}else {
	System.out.println("Not a valid day");
}
	}

}
