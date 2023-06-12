package com.arkajyoti;

import java.util.Scanner;
//Q11.  Each Instructor has name and phone number. One can view instructor information and set the information. 
//Textbook has a title, author name and publisher. One can set the data for a textbook and view the same. 
//Each course has a course name, instructor and text book. 
//One can set the course data and view the same.  Design and implement the classes .
public class q11Course {
    public static void main(String[] args) {
        int choice;
        try (Scanner input = new Scanner(System.in)) {
            do{
                System.out.println();
            System.out.println("1. Update Course info ");
            System.out.println("2. View Course info");
            System.out.println("3. Exit ");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();
                switch (choice) {
                    case 1:
                        Course.setData();
                        break;
                    case 2:
                        Course.viewData();
                        break;
                    case 3:
                        System.exit(1);
                    default:
                        System.out.println("Enter a valid Choice!!!");
                        break;
                }
            }while(choice!=3);
        }
    }
}
