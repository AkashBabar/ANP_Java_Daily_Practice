package com.javabasic;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		// ------------------- Arithmetic Operators -------------------
		System.out.println("\n--- Arithmetic Operators ---");
		System.out.println("Addition (a + b): " + (a + b));
		System.out.println("Subtraction (a - b): " + (a - b));
		System.out.println("Multiplication (a * b): " + (a * b));
		System.out.println("Division (a / b): " + (a / b));
		System.out.println("Modulus (a % b): " + (a % b));

		// ------------------- Relational Operators -------------------
		System.out.println("\n--- Relational Operators ---");
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a > b: " + (a > b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a >= b: " + (a >= b));
		System.out.println("a <= b: " + (a <= b));

		// ------------------- Logical Operators -------------------
		System.out.println("\n--- Logical Operators ---");
		boolean x = (a > 5);
		boolean y = (b < 10);
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("x && y: " + (x && y));
		System.out.println("x || y: " + (x || y));
		System.out.println("!x: " + (!x));

		// ------------------- Assignment Operators -------------------
		System.out.println("\n--- Assignment Operators ---");
		int c = a; // assign
		System.out.println("c = a: " + c);
		c += b;
		System.out.println("c += b: " + c);
		c -= b;
		System.out.println("c -= b: " + c);
		c *= b;
		System.out.println("c *= b: " + c);
		c /= b;
		System.out.println("c /= b: " + c);
		c %= b;
		System.out.println("c %= b: " + c);

		// ------------------- Unary Operators -------------------
		System.out.println("\n--- Unary Operators ---");
		System.out.println("a = " + a);
		System.out.println("++a (pre-increment): " + (++a));
		System.out.println("--a (pre-decrement): " + (--a));
		System.out.println("a++ (post-increment): " + (a++));
		System.out.println("a after post-increment: " + a);
		System.out.println("a-- (post-decrement): " + (a--));
		System.out.println("a after post-decrement: " + a);

		// ------------------- Bitwise Operators -------------------
		System.out.println("\n--- Bitwise Operators ---");
		System.out.println("a & b: " + (a & b));
		System.out.println("a | b: " + (a | b));
		System.out.println("a ^ b: " + (a ^ b));
		System.out.println("~a: " + (~a));
		System.out.println("a << 1: " + (a << 1));
		System.out.println("a >> 1: " + (a >> 1));
		System.out.println("a >>> 1: " + (a >>> 1));

		// ------------------- Ternary Operator -------------------
		System.out.println("\n--- Ternary Operator ---");
		String result = (a > b) ? "a is greater" : "b is greater or equal";
		System.out.println("Result: " + result);

		sc.close();
	}
}
