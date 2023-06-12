package com.arkajyoti;
// Each Instructor has name and phone number. One can view instructor information and set the information.
// Textbook has a title, author name and publisher. One can set the data for a textbook and view the same.
// Each course has a course name, instructor and text book.
// One can set the course data and view the same.  Design and implement the classes .
public class TextBook {
    private static String title;
    private static String name;
    private static String publisher;

    public void getData()
    {
        System.out.println("Title:- " + title);
        System.out.println("Author Name:- " + name);
        System.out.println("Publisher:- " + publisher);
    }
    public void setData(String t, String n, String pub)
    {
        title = t;
        name = n;
        publisher = pub;
    }
}
