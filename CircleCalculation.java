package com.javabasic;

import java.util.Scanner;

public class CircleCalculation {
	public static void main(String[] args) {
		double radius, area, perimeter;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		radius = sc.nextDouble();

		// Formula for area = π * r^2
		area = Math.PI * radius * radius;

		// Formula for perimeter (circumference) = 2 * π * r
		perimeter = 2 * Math.PI * radius;

		System.out.println("Area of Circle = " + area);
		System.out.println("Perimeter of Circle = " + perimeter);

		sc.close();
	}
}
