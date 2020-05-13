/*
Author: Gabriel Carlson
Date: 5/12/2020

This assignment is to count how many vowels and consonants with a given string
 */

import java.util.Scanner;

public class NewClass51249 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter any string:");
        String cv = input.nextLine();

        int vowels = 0;
        
        int consonants =0;
         
        
        
       

        for (int i = 0; i < cv.length(); i++) {

            if (Character.isLetter(cv.charAt(i)))  {
                if (Character.toUpperCase(cv.charAt(i)) == 'I' ||
                        Character.toUpperCase(cv.charAt(i)) == 'E' ||
                        Character.toUpperCase(cv.charAt(i)) == 'O' ||
                        Character.toUpperCase(cv.charAt(i)) == 'A' ||
                        Character.toUpperCase(cv.charAt(i)) == 'U') 
                {
                    vowels++;
                }
                else 
                    consonants++;
                
            }           
        }       
            
            
            System.out.println("The amount of vowels in this string:" + vowels + "\n");
            System.out.println("The amount of consonants in this string:" + consonants + "\n");
        
    }
}