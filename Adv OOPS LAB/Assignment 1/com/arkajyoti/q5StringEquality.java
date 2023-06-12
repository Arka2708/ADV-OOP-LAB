package com.arkajyoti;

import java.util.Scanner;
//Q5. Write a program that accepts a String and assigns it to another.
// Check the outcome of comparison with == and equals() method.
// Take two Strings and put same input for them. Repeat the equality checking. Observe the outcome.

public class q5StringEquality {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a String : ");
            String s1 = input.next();
            String s2 = s1;
            System.out.println( s1 == s2);
            System.out.println( s1.equals(s2));
        }
        System.out.println("Equality checking for the case of taking two strings and putting same input for them ");
        
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println( s3 == s4);
        System.out.println( s3.equals(s4));
    }
}
