package com.arkajyoti;
// Each Instructor has name and phone number. One can view instructor information and set the information.
// Textbook has a title, author name and publisher. One can set the data for a textbook and view the same.
// Each course has a course name, instructor and text book.
// One can set the course data and view the same.  Design and implement the classes .
public class Instructor {
    private static String name;
    private static String phoneNumber;

    public void viewInformation()
    {
        System.out.println("Instructor Name:- " + name);
        System.out.println("Instructor Phone Number:- " + phoneNumber);
    }
    public void setInformation(String n, String ph)
    {
        name = n;
        phoneNumber = ph;
    }
}
