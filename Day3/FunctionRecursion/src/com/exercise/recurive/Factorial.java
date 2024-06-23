package com.exercise.recurive;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input;
		do {
			System.out.print("Enter a factorial number : ");
			input = scanner.next();

			if (!input.equalsIgnoreCase("exit")) {

				int number = Integer.parseInt(input);

				if (number < 0) {
					System.out.println("Factorial is not defined for negative numbers.");
				} else {
					System.out.println("Factorial of " + number + " is: " + factorial(number));
				}

				System.out.print("Do you want to terminate this program (y/n) : ");
				input = scanner.next();
			}
		} while (!input.equalsIgnoreCase("y"));

		System.out.println("Terminating the program.");

		scanner.close();
	}

	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		}

		return number * factorial(number - 1);
	}
}
