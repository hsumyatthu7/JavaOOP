package com.assignment4.IS;

public class Car {

	private String brand;
	private String model;
	private int year;
	private static int numberOfCars;

	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		numberOfCars++;
	}

	public void displayDetails() {
		System.out.println("Brand: " + brand + ", Model: " + model + " , Year: " + year);

	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Mark X", 2020);
		Car car2 = new Car("Honda", "Civic Type R", 2024);

		car1.displayDetails();
		car2.displayDetails();

		System.out.println("Total number of cars: " + Car.getNumberOfCars());
	}

}
