package com.arkajyoti;
//Q7. Design and implement Student class with roll, name and score as attributes.
// It will have methods to set attributes (attribute values passed as arguments), display the attributes,
// copy (that copies the content of invoking object to another object passed as argument).
// Verify that methods are working properly.
public class q7Student {
    public static void main(String[] args) {
        // Create a new student
        Student s1 = new Student(1, "John", 95);
        // Display the attributes
        s1.displayAttributes();
        // Update the attributes
        s1.setRoll(2);
        s1.setName("Jane");
        s1.setScore(88);
        // Display the updated attributes
        s1.displayAttributes();
        // Create a new student and copy the attributes of the first student
        Student s2 = new Student(0, "", 0);
        s2.copyAttributes(s1);
        // Display the attributes of the second student
        s2.displayAttributes();
    }
}