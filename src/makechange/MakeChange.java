package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double price, tendered, change;

		System.out.println("What is the price of the item? ");
		price = kb.nextDouble();
		System.out.println("How much did you pay");
		tendered = kb.nextDouble();

		change = tendered - price;
		// round off to two decimal places using integer cast
		change = (int) (change * 100) / 100.0;
		
		System.out.printf("Customer's change is: %.2f\n", change);

		if (tendered < price)
			System.out.println("Insufficient funds");
		else if (tendered == price)
			System.out.println("Thank customer");
		
		// store the amount of bills or coins to return to customer:
		int twenties = 0, tens =0, fives = 0, ones = 0, quarters = 0, dimes = 0, nickles = 0, pennies = 0;
		
		// step-down through denominations beginning with twenty dollar bills down to pennies
		
		while ( change >= 20) {
			twenties++;
			change -= 20; 
		}
		while ( change >= 10) {
			tens++;
			change -=10;
		}
		while ( change >= 5) {
			fives++;
			change -=5;
		}
		while ( change >= 1) {
			ones++;
			change -=1;
		}
		while ( change >= 0.25) {
			quarters++;
			change -=0.25;
		}
		while ( change >= 0.10) {
			dimes++;
			change -=0.10;
		}
		while ( change >= 0.05) {
			nickles++;
			change -=0.05;
		}
		while ( change >= 0.01) {
			pennies++;
			change -=0.01;
		}
		
		String message = "";
		
		if (tendered < price) {
			message += "Error, insufficient funds.";
		}
		
		//twenties
		if (twenties >= 1) {
			if (twenties >= 2) {
				message += twenties + " twenty dollar bills, ";
			} else {
				message += twenties + " twenty dollar bill, ";
			}
		}
		
		// tens
		if (tens == 1) {
			message += tens + " ten dollar bill, ";
		}
		if (tens >= 2) {
			message += tens + " ten dollar bills, ";
		}
		
		//fives
		if (fives >= 1) {
			if (fives >= 2) {
			message += fives + " five dollar bills, ";
			} else {
			message += fives + " five dollar bill, ";
			}
		}
		
		//ones
		if (ones >= 1) {
			if (ones >= 2) {
			message += ones + " one dollar bills, ";
			} else {
			message += ones + " one dollar bill, ";
			}
		}
		
		//quarters
		if (quarters >= 1) {
			if (quarters >= 2) {
			message += quarters + " quarters, ";
			} else {
			message += quarters + " quarter, ";
			}
		}
		
		//dimes
		if (dimes >= 1) {
			if (dimes >= 2) {
			message += dimes + " dimes, ";
			} else {
			message += dimes + " dime, ";
			}
		}
		
		//nickels
		if (nickles >= 1) {
			if (nickles >= 2) {
			message += nickles + " nickles, ";
			} else {
			message += nickles + " nickle, ";
			}
		}
		
		//pennies
		if (pennies >= 1) {
			if (pennies >= 2) {
			message += pennies + " pennies, ";
			} else {
			message += pennies + " penny, ";
			}
		}

		
		System.out.printf("Amount: %.2f, Tendered: %.2f, Result: ", price, tendered);		
		System.out.println(message);

	
		kb.close();

	}
}
