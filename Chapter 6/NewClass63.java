/*
Author: Gabriel Carlson
Date: 5/26/2020

This assignment is to write a program that prompts user to enter a number and tells if it is a palindrome or not. 
 */

import java.util.Scanner;

public class NewClass63 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number:");
        int palindrome = input.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.print("Number: " + palindrome + "This is a palindrome");
        } else {
            System.out.print("Number: " + palindrome + "This is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";
        for (int p = n.length() - 1; p >= 0; p--) {
            reverse += n.charAt(p);
        }

        return Integer.parseInt(reverse);
    }

}
