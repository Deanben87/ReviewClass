package com.syntax.reviewClass6;

public class School {

	public static void main(String[] args) {
		System.out.println("hello   ");

		Student student1 = new Student();

		student1.name = "Dean";
		student1.lastName = "Ben";
		student1.Address = "Chicago";

		student1.studentId = 101;
		student1.age = 35;
		student1.grade = 'A';

		/*
		 * subject cannot be resolved or is not
		 *  student1.subject="Java";
		 */

		Student student2 = new Student();
		// accessing variables of student class
		student2.name = "Amine";
		student2.lastName = "Ben";
		student2.Address = "Algiers";
		student2.studentId = 102;
		student2.age = 25;
		student2.grade = 'A';
		// accessing methods of student class
		student2.study();
		student2.doHomework();

		System.out.println("-----------------");

		student1.study();
		student1.doHomework();
		
		String fullName=student1.getFullName();//first method
		System.out.println(fullName);
		
	    System.out.println(student2.getFullName());//second method 
	    
	    student1.printInfo();
	    student2.printInfo();
	    
	    student1.takeSubject("git");
	    student2.takeSubject("Java");
	}
}
