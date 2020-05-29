/*
Author:Gabriel Carlson
Date: 5/27/2020

This assignment is to write a program that prompts user to enter a number and provides the width and string. 
 */

import java.util.Scanner;

public class NewClass67 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter any number: ");
        int number = input.nextInt();
         System.out.print("Enter the width for the number: ");
        int width = input.nextInt();
        System.out.print(format(number, width));
    }

    public static String format(int number, int width) {
        String format = "";
        int amount = (number + "").length();
        if (width > amount) {
            for (int n = 1; n <= width - amount; n++) {
                format = format + "0";
            }
            return format + number;

        } else {
            return "" + number;
        }

    }
}
