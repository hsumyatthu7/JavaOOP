package com.exercise.recurive;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input;
		do {
			System.out.print("Enter a  number : ");
			input = scanner.next();

			if (!input.equalsIgnoreCase("exit")) {

				int number = Integer.parseInt(input);

				System.out.println("Fibonacci Number " + number + " is: " + fibonacci(number));

				System.out.print("Do you want to terminate this program (y/n) : ");
				input = scanner.next();
			}
		} while (!input.equalsIgnoreCase("y"));

		System.out.println("Terminating the program.");

		scanner.close();
	}

	public static int fibonacci(int n) {
		if (n == 1)
			return 1;
		else if (n == 0)
			return 0;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
