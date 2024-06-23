package com.exercise.recurive;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input;
		do {
			System.out.print("Enter a natural number : ");
			input = scanner.next();

			if (!input.equalsIgnoreCase("exit")) {

				int number = Integer.parseInt(input);

				if (number < 0) {
					System.out.println("Natural number can't be negative number.");
				} else {
					System.out.println("Sum of Natural Number" + number + " is: " + sumNumbers(number));
				}

				System.out.print("Do you want to terminate this program (y/n) : ");
				input = scanner.next();
			}
		} while (!input.equalsIgnoreCase("y"));

		System.out.println("Terminating the program.");

		scanner.close();

	}

	public static int sumNumbers(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sumNumbers(n - 1);
	}

}
