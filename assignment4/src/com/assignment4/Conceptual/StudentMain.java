package com.assignment4.Conceptual;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student s1 = new PrimaryStudent();
		s1.work();
	
		Student s2 = new ElementaryStudent();
		s2.work();
		
		Student s_add = new Student();
		System.out.println("Two args method   : " +s_add.add(1,2));
		System.out.println("Three args method : " +s_add.add(1,2,3));
	}
		

}
