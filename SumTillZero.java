package com.javabasic;

import java.util.Scanner;

public class SumTillZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num > 0) {
			int sum = 0;
			System.out.print("Series: ");
			for (int i = 0; i <= num; i++) {
				sum += i;
				if (i != num) {
					System.out.print(i + " + ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println("\nSum = " + sum);
		} else {
			System.out.println("Number is not positive.");
		}

	}
}
