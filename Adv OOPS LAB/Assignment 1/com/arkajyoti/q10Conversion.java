package com.arkajyoti;

import java.util.Scanner;
//Q10. Design a Metric class that supports Kilometre to Mile conversion with distance in Kilometre as argument 
//and Mile to Kilometre conversion with distance in mile as argument. Assume, one Mile equals 1.5 Kilometre.

public class q10Conversion {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("1. Input in km ");
            System.out.println("2. Input in Miles ");
            System.out.print("Enter the your choice choice of unit : ");
            int choice = input.nextInt();
            if(choice ==1) {
                System.out.print("Enter the distance in km : ");
                double km = input.nextDouble();
                double kmToMileResult = Metric.kmToMile(km);
                System.out.println(km + " km = " + kmToMileResult + " miles");
            }
            else {
                System.out.print("Enter the distance in miles : ");
                double mile = input.nextDouble();
                double mileToKmResult = Metric.mileToKm(mile);
                System.out.println(mile + " miles = " + mileToKmResult + " km");
            }
        }
    }
}
