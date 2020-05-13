/*
Author:Gabriel Carlson
Date: 5/11/2020

This project is to display numbers 100 through 200 that are divisible by 5 or 6
 */

public class NewClass_51 {

    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
          int count = 0;

        System.out.print("The numbers between 100 and 200 divisible by 5 or 6 are:\n");

        for (int n = 100; n <= 200; n++) {
            if (n % 5 == 0 ^ n % 6 == 0) {

                count++;
                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println(n);
                } else {
                    System.out.print(n);
                }

                System.out.println();

            }

        }
    }
}
