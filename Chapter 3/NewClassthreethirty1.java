/*
Author: Gabriel Carlson
Date: 4/30/2020

This assignment is to write a program that prompts to enter variables and show the output
 */

import java.util.Scanner;

public class NewClassthreethirty1{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a:");
        double a = in.nextDouble();
        System.out.print("Enter b:");
        double b = in.nextDouble();
        System.out.print("Enter c:");
        double c = in.nextDouble();
        System.out.print("Enter d:");
        double d = in.nextDouble();
        System.out.print("Enter e:");
        double e = in.nextDouble();
        System.out.print("Enter F:");
        double f = in.nextDouble();

        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

    }
}
