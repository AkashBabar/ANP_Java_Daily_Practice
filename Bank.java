package com.javabasic;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "";
		int accNo = 0;
		double balance = 0;
		boolean accountCreated = false;

		while (true) {
			System.out.println("\n # BANKING SYSTEM #");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Check Balance");
			System.out.println("5. Loan Process");
			System.out.println("6. Fixed Deposit");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.print("Enter Customer Name: ");
				name = sc.nextLine();
				System.out.print("Enter Account Number: ");
				accNo = sc.nextInt();
				System.out.print("Enter Initial Balance: ");
				balance = sc.nextDouble();
				accountCreated = true;
				System.out.println("Account Created Successfully!");
				break;

			case 2:
				if (accountCreated) {
					System.out.print("Enter amount to deposit: ");
					double dep = sc.nextDouble();
					if (dep > 0) {
						balance += dep;
						System.out.println("Deposited Successfully! New Balance: " + balance);
					} else {
						System.out.println("Invalid Amount!");
					}
				} else {
					System.out.println("Please create an account first!");
				}
				break;

			case 3:
				if (accountCreated) {
					System.out.print("Enter amount to withdraw: ");
					double withdraw = sc.nextDouble();
					if (withdraw > 0 && withdraw <= balance) {
						balance -= withdraw;
						System.out.println("Withdrawn Successfully! Remaining Balance: " + balance);
					} else {
						System.out.println("Invalid or Insufficient Balance!");
					}
				} else {
					System.out.println("Please create an account first!");
				}
				break;

			case 4:
				if (accountCreated) {
					System.out.println("Account Holder: " + name);
					System.out.println("Account Number: " + accNo);
					System.out.println("Current Balance: " + balance);
				} else {
					System.out.println("Please create an account first!");
				}
				break;

			case 5:
				if (accountCreated) {
					System.out.print("Enter Loan Amount: ");
					double loan = sc.nextDouble();
					System.out.print("Enter Interest Rate (%): ");
					double rate = sc.nextDouble();
					System.out.print("Enter Time (in years): ");
					double time = sc.nextDouble();

					double interest = (loan * rate * time) / 100;
					double total = loan + interest;

					System.out.println("💸 Loan Interest: " + interest);
					System.out.println("💰 Total Payable Amount after " + time + " years: " + total);
				} else {
					System.out.println("⚠️ Please create an account first!");
				}
				break;

			case 6:
				if (accountCreated) {
					System.out.print("Enter FD Amount: ");
					double fdAmount = sc.nextDouble();
					System.out.print("Enter FD Duration (in years): ");
					int years = sc.nextInt();

					double fdRate = 6.5;
					double maturity = fdAmount + (fdAmount * fdRate * years) / 100;

					System.out.println("Fixed Deposit Interest Rate: " + fdRate + "%");
					System.out.println("Maturity Amount after " + years + " years: " + maturity);
				} else {
					System.out.println("Please create an account first!");
				}
				break;

			case 7:
				System.out.println("Thank you for using the Banking System!");
				sc.close();
				return; 

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}
}
