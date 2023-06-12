// Q1. Write a program to accept two short integers from user and display the sum.

package com.arkajyoti;

import java.util.Scanner;

public class q1Sum {

    public static void main(String[] args) {
	try (Scanner input = new Scanner(System.in)) {
            short num1 = input.nextShort();
            short num2 = input.nextShort();
            short sum = (short) (num1 + num2); // sum of two short integers
            System.out.println("Sum = " + sum);
        }
    }
}
