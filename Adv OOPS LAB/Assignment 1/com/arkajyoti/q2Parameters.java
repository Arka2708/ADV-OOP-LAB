package com.arkajyoti;
//Q2. Write a program that accepts number of command line parameters and displays the parameters 
//and count of such parameters.

public class q2Parameters {
    public static void main(String[] args) {
        System.out.println("Number of parameters: " + args.length);
        for(int i=0 ; i< args.length ; i++)
        {
            System.out.println("Parameter " + (i+1) + ": " + args[i]); //prints all the parameters
        }
    }
}
