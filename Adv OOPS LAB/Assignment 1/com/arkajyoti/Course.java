package com.arkajyoti;
import java.util.Scanner;

// Each Instructor has name and phone number. One can view instructor information and set the information.
// Textbook has a title, author name and publisher. One can set the data for a textbook and view the same.
// Each course has a course name, instructor and text book.
// One can set the course data and view the same.  Design and implement the classes .
public class Course {
   private static String name;
   static Instructor ins;
   static TextBook tb;

   public static void viewData(){
      System.out.println("Course Name :- " + name);
      ins.viewInformation();
      tb.getData();
   }
   public static void setData()
   {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Enter Course Name: ");
         name = input.nextLine();
         System.out.print("Enter Instructor Name: ");
         String n = input.nextLine();
         System.out.print("Enter Instructor Phone Number: ");
         String ph = input.nextLine();
         ins.setInformation(n,ph);
         System.out.print("Enter Book Title: ");
         String t = input.nextLine();
         System.out.print("Enter Author's Name: ");
         String s  = input.nextLine();
         System.out.print("Enter Book Publisher: ");
         String pub  = input.nextLine();
         tb.setData(t,s,pub);
      }
   }
}
