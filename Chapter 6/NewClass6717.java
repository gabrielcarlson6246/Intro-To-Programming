/*
Author:Gabriel Carlson
Date: 5/14/2020

This assignment is to prompt user to enter n and display and n by n matrix. 
 */

import java.util.Scanner;

public class NewClass6717 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number for n:");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {

        for (int o = 0; o < n; o++) {
            for (int p = 0; p < n; p++) {
                System.out.print((int) (Math.random() * 2) + "");
            }
            System.out.println();
        }
    }
}
