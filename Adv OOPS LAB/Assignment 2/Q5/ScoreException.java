package Q5;

import Q5.Student.InvalidScoreException;
//Q5. Design a Class Student with name , roll and score. Support must be there to set the score.
// Score is non-negative and cannot exceed 100. For invalid question an exception should be raised.
// User of set score method will decide about the measures to deal with the exceptions.
class Student {
    private String name;
    private int roll,score;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Invalid score: " + score);
        }
        this.score = score;
    }
    public class InvalidScoreException extends Exception {
        public InvalidScoreException(String message) {
            super(message);
        }
    }
}
public class ScoreException {
    public static void main(String[] args) {
        Student student = new Student("Arka", 1);
        try {
            student.setScore(95);
            System.out.println("Score set successfully");
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student.setScore(120); // Invalid score
            System.out.println("Score set successfully");
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the exception appropriately
        }
        System.out.println("Student: " + student.getName() + ", Roll: " + student.getRoll() + ", Score: " + student.getScore());
    }
}

