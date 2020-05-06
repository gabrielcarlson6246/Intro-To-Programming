/*
Author: Gabriel Carlson
Date: 5/5/2020

This project is to write a program that reads the info and displays a payroll statement
 */

import java.util.Scanner;

public class NewClass42three1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name:");
         String name =input.next();
        System.out.print("Hours in a week worked:");
        double hoursinaweek = input.nextDouble();

        System.out.print("Hour pay rate:");
        double hourpay = input.nextDouble();
        
        System.out.print("Federal tax withholding:");
        double fedtaxrate = input.nextDouble();
        
        System.out.print("State tax withholding:");
        double statetaxrate = input.nextDouble();
         
        double grossPay = 0.0; 
        double totalDeduction = 0.0;
        double netPay = 0.0;
        double fedtax = 0.0;
        double statetax = 0.0;
         
        
        grossPay = hourpay * hoursinaweek; 
        fedtax = grossPay * fedtaxrate;
        statetax = grossPay * statetaxrate;
        totalDeduction = fedtax + statetax;
        netPay = grossPay - totalDeduction;
        
        System.out.println("Employee Name:" + name);
        System.out.printf("Hours Worked %.2f\n" , hoursinaweek);
        System.out.printf("Hourly pay rate %.2f\n" , hourpay);
        System.out.printf("Federal tax withholding %.2f\n" , fedtax);
        System.out.printf("State tax withholding %.2f\n" , statetax);
        System.out.printf("Net Pay %.2f\n" , netPay);
    
    }
    
    
}