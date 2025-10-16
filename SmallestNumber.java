package com.javabasic;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int smallest = a;

		if (b < smallest) {
			smallest = b;
		} else if (c < smallest) {
			smallest = c;
		} else if (d < smallest) {
			smallest = d;
		} else if (e < smallest) {
			smallest = e;
		}

		System.out.println("Smallest number is: " + smallest);

	}
}
