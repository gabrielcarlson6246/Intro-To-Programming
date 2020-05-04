/*
Author:Gabriel Carlson
Date 5/3/2020

This program is to find the valid and invalid inputs of a proper triangle
 */

import java.util.Scanner;
public class Newclassthree9teen {
  public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Enter length for 3 sides of a triangle:");
     System.out.print("Length for Side A:");

     double sideA = input.nextDouble();
     System.out.print("Length for Side B:");

     double sideB = input.nextDouble();
     System.out.print("Length for Side C:");

     double sideC = input.nextDouble();


     if (sideB < sideA + sideC && sideB < sideA + sideC && sideC < sideA + sideB) 
     {
        double perimeter = sideA + sideB + sideC;

        System.out.println("Perimeter = " + perimeter);
     }

     else {

        System.out.println("The Entered Input is invalid");
     }

  }

   

}
        

        

              
              
              
             
              

 
          
         

     
          


     

