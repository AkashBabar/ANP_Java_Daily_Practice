package com.javabasic;

import java.util.Scanner;

public class Arithmetic_operations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();

		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();

		// operations
		double sum = num1 + num2;
		double Substraction = num1 - num2;
		double Multiplication = num1 * num2;
		double Division = num1 / num2;

		System.out.println(sum);
		System.out.println(Substraction);
		System.out.println(Multiplication);
		System.out.println(Division);
		sc.close();
	}
}
