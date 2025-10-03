package com.javabasic;

import java.util.Scanner;

public class Employee_Basic_Details {

	public static void main(String[] args) {
		String name;
		int age;
		char gender;
		String address;
		long phoneNumber;
		String email;
		String designation;
		double salary;

		Scanner sc = new Scanner(System.in);

		System.out.println("-------Employee Details------");

		System.out.println("Enter Employee Name:");
		name = sc.nextLine();

		System.out.println("Enter Employee Age:");
		age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Employee Gender (M/F):");
		gender = sc.next().charAt(0);
		sc.nextLine();

		System.out.println("Enter Employee Address:");
		address = sc.nextLine();

		System.out.println("Enter Employee Phone Number:");
		phoneNumber = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter Employee Email:");
		email = sc.nextLine();

		System.out.println("Enter Employee Designation:");
		designation = sc.nextLine();

		System.out.println("Enter Employee Salary:");
		salary = sc.nextDouble();

		// Display employee details
		System.out.println("-------Entered Employee Details------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);

		sc.close();
	}
}
