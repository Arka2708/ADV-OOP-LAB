package com.arkajyoti;

// Q8. Add constructors in the Student class of earlier problem so that objects can be created with 
//i) roll only, ii) roll and name only, iii) roll, name and score, iv) no value. 
//Also include a copy constructor. Check whether constructors are working or not. 
//Verify, copy constructor results into deep coy or not.

public class q8Student {
        public static void main(String[] args) {
            // Create a student with roll only
            Student s1 = new Student(1);
            s1.displayAttributes();

            // Create a student with roll and name only
            Student s2 = new Student(2, "Arka");
            s2.displayAttributes();

            // Create a student with roll, name, and score
            Student s3 = new Student(3, "Ronaldo", 95);
            s3.displayAttributes();

            // Create a student with no value
            Student s4 = new Student();
            s4.displayAttributes();

            // Copy a student using the copy constructor
            Student s5 = new Student(s3);
            s5.displayAttributes();

            // Verify that the copy is a deep copy
            s3.setRoll(4);
            s3.setName("Alexander");
            s3.setScore(88);
            s3.displayAttributes();
            s5.displayAttributes();
        }
}
