package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	ArrayList<Double> userList = new ArrayList<Double>();
	public static void product(double num, int userNum, double userProduct) {
		Scanner scnr = new Scanner(System.in);
		if (userNum <= 5) {
			System.out.println("Please enter a number: ");
			num = scnr.nextDouble();
			userProduct *= num;
			userNum ++;
			product(num, userNum, userProduct);
		} else {
			System.out.println("Operation complete. Product of inputs is: " + userProduct);
		}
	}	
	public static void main(String[] args) {
		product(0, 0, 0);	
	}
}