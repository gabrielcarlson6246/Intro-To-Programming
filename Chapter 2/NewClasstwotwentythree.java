/*
Author: Gabriel Carlson
Date: 4/24/2020

This file is to find the cost of driving
 */

import java.util.Scanner;

public class NewClasstwotwentythree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the distace to drive, the fuel 
		// efficiency of the car in miles and the price per gallon.
		System.out.print("Enter the driving distace: ");
		double distace = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();

		// Compute the cost of driving
		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		// Display result
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}
