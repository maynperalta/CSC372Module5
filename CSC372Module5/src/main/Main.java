package main;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void product(int count, double product, Scanner scnr) {
		
		if (count == 5) {
			System.out.printf("The product of your numbers is: %.2f", product);
			return;
		}
		System.out.println("Please enter number " + (count + 1) + ": ");
		
		try {
			double num = scnr.nextDouble();	
			product(count + 1, product * num, scnr);
			
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid number.");
			scnr.next();
			product(count, product, scnr);
		}
	}	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);	
		product(0, 1, scnr);	
		scnr.close();
	}
}
