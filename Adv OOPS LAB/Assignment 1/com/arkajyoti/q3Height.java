package com.arkajyoti;

import java.util.Scanner;

//Q3. Write a program that accepts height in cm as int and displays the height in feet and inches.
// Assume, 1 inch equals to 2.54 cm and 1 foot equals to 30.5 cm.

public class q3Height {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the height in cm :");
            int height_in_cm = input.nextInt();
            int foot = (int)(height_in_cm/30.5);
            int inch = (int)( ( height_in_cm - (foot*30.5) ) / 2.54 );
            System.out.println("The height is " + foot + " ft. " + inch + " inches ");
        }

    }
}
