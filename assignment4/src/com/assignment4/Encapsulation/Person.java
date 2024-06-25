package com.assignment4.Encapsulation;

public class Person {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 18 && age<35) {
		this.age = age;
		}else {
			System.out.println("Age must be between 18 and 35..");
		}
		
	}
	
	

}
