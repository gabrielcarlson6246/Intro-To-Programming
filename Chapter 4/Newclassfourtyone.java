/*
Author: Gabriel Carlson
Date: 5/4/2020

This project is to prompt user to enter the length from the center of a pentagon and compute the area of a pentagon
 */

import java.util.Scanner;

public class Newclassfourtyone {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center of the pentagon to a vertex:");
        double r = input.nextDouble();

        double s = (2 * r) * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.print("Area of pentagon is:" + area);

    }
}
