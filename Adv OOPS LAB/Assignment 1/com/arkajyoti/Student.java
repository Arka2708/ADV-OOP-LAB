package com.arkajyoti;
//Add constructors in the Student class of earlier problem so that objects can be created with
// i) roll only, ii) roll and name only, iii) roll, name and score, iv) no value.
// Also include a copy constructor. Check whether constructors are working or not.
// Verify, copy constructor results into deep coy or not.

public class Student {
    int roll;
    String name;
    int score;

    public Student(int roll) {
        this.roll = roll;
        this.name = "";
        this.score = 0;
    }
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.score = 0;
    }
    public Student(int roll, String name, int score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }
    public Student() {
        this.roll = 0;
        this.name = "";
        this.score = 0;
    }
    public Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.score = other.score;
    }

    public void setRoll(int Rno){
        this.roll = Rno;
    }
    public void setName(String s) {
        this.name= s;
    }
    public void setScore(int marks) {
        this.score = marks;
    }
    public void displayAttributes() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
    public void copyAttributes(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.score = other.score;
    }
}