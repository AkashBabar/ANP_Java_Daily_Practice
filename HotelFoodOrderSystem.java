package com.javabasic;

import java.util.Scanner;

public class HotelFoodOrderSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int totalBill = 0;

		do {

			System.out.println("----- Hotel Menu -----");
			System.out.println("1. Burger - Rs. 100");
			System.out.println("2. Pizza - Rs. 250");
			System.out.println("3. Pasta - Rs. 150");
			System.out.println("4. Sandwich - Rs. 80");
			System.out.println("5. French Fries - Rs. 70");
			System.out.println("6. Cold Drink - Rs. 50");
			System.out.println("7. Ice Cream - Rs. 60");
			System.out.println("8. Coffee - Rs. 40");
			System.out.println("9. Tea - Rs. 30");
			System.out.println("10. Exit");
			System.out.println("----------------------");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You ordered Burger.");
				totalBill += 100;
				break;
			case 2:
				System.out.println("You ordered Pizza.");
				totalBill += 250;
				break;
			case 3:
				System.out.println("You ordered Pasta.");
				totalBill += 150;
				break;
			case 4:
				System.out.println("You ordered Sandwich.");
				totalBill += 80;
				break;
			case 5:
				System.out.println("You ordered French Fries.");
				totalBill += 70;
				break;
			case 6:
				System.out.println("You ordered Cold Drink.");
				totalBill += 50;
				break;
			case 7:
				System.out.println("You ordered Ice Cream.");
				totalBill += 60;
				break;
			case 8:
				System.out.println("You ordered Coffee.");
				totalBill += 40;
				break;
			case 9:
				System.out.println("You ordered Tea.");
				totalBill += 30;
				break;
			case 10:
				System.out.println("Thank you for ordering!");
				break;
			default:
				System.out.println("Invalid choice! Please select again.");
			}

			if (choice != 10) {
				System.out.println("Current total bill: Rs. " + totalBill);
				System.out.println();
			}

		} while (choice != 10);

		System.out.println("Final Bill Amount: Rs. " + totalBill);

	}
}
