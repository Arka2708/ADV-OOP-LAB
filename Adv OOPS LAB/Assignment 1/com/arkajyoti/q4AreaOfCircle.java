package com.arkajyoti;

import java.util.Scanner;
//Q4. Write a program that accepts radius of a circle and displays area of the circle.
// Declare a constant pi equals to 3.14.

public class q4AreaOfCircle {
    private static final double pi =  3.14d;
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the radius of circle: ");
            int radius = input.nextInt();
            double area = (pi * radius * radius); // calculate the area of the circle
            System.out.println("The Area of the circle is : " + area + " squareunits");
        }
    }
}
