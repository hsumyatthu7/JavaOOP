package com.assignment4.Inheritance.Overriding;

public class Shape {

	public void draw() {
		System.out.println("Shape....");
	}
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle....");
	}
}

class Square extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Square....");
	}
}