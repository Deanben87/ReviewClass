package com.syntax.reviewclass2;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Operators in java Arithmetic Operators + - / * % 
		//Logical Operator == != >= <= ><
		
		int num=10;
		int num2=10;
        System.out.println(num+num2);
        System.out.println(num>=num2);//num>num2 or num=num2=>its true 
        //whole o-infinity / Negative to positive infinity 
        
       System.out.println(Long.MAX_VALUE);//Gives us the maximum range	
       System.out.println(Long.MIN_VALUE);//Gives us the minimum range 
       System.out.println(Byte.MAX_VALUE);
       System.out.println(Integer.MAX_VALUE);
       System.out.println(num/num2);
       System.out.println(num%num2);
       
       System.out.println(10.0/3.0);
       System.out.println((int)10.0/3);
       System.out.println((int)10.5*3);//here we lose the decimal 
       
	}

}
