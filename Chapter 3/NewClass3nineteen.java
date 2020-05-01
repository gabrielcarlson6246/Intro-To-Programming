/*
Author: Gabriel Carlson
Date: 5/1/2020

This program is to find the perimeter of a triangle if the input is valid
 */

import java.util.Scanner;

public class NewClass3nineteen {





public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the length of three sides of a triangle: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    input.close();

    if (isTriangle(side1, side2, side3)) {
        double perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of your triangle is " + perimeter
                + ".");
    } else {
        System.out.println("Your input is not a valid triangle.");
    }
}

private static boolean isTriangle(double side1, double side2, double side3) {
    boolean isTriangle = ((side1 + side2 > side3)
            && (side1 + side3 > side2) && (side3 + side2 > side1));
    return isTriangle;
	}
}