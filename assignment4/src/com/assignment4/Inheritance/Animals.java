package com.assignment4.Inheritance;

public class Animals {

	public void makeSound() {
		System.out.println("Animals Sound...");
	}
}

 class Dog extends Animals{
	 
	 @Override
	public void makeSound() {
		System.out.println("Bark...");
	}
	 
 }