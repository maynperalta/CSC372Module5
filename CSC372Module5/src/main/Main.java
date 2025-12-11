package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	ArrayList<Double> userList = new ArrayList<Double>();
	public static void product(int userNum, double userProduct, Scanner scnr) {
		
		if (userNum < 5) {
			System.out.println("Please enter a number: ");
			double num = scnr.nextDouble();
			
			userProduct *= num;
			
			product(userNum + 1, userProduct, scnr);
		} else {
			System.out.println("Operation complete. Product of inputs is: " + userProduct);
		}
	}	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		product(0, 1, scnr);	
		
		scnr.close();
	}
}
