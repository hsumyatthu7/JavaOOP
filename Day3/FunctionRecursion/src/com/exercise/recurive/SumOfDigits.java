package com.exercise.recurive;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input;
		do {
			System.out.print("Enter some digits : ");
			input = scanner.next();

			if (!input.equalsIgnoreCase("exit")) {

				int number = Integer.parseInt(input);

				if (number < 0) {
					System.out.println("Digits can't be negative number.");
				} else {
					System.out.println("Sum of Digits " + number + " is: " + sumOfDigits(number));
				}

				System.out.print("Do you want to terminate this program (y/n) : ");
				input = scanner.next();
			}
		} while (!input.equalsIgnoreCase("y"));

		System.out.println("Terminating the program.");

		scanner.close();

	}

	public static int sumOfDigits(int n) {
		
		if (n>0 && n<10) {
			return n;
		}else {
			int lastDigit = n % 10;
			int reamining = n/10;
		return lastDigit + sumOfDigits(reamining);
		}
	}
}
