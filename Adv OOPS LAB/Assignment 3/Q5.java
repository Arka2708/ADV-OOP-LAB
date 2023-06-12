import java.io.*;
import java.util.*;
/*
 Q5. Student class contains roll, name and score. Write a program to store the objects in a file and
thereafter read all the objects.
 */
class Student implements Serializable {
    private int roll, score;
    private String name;

    public Student(String name, int roll, int score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
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
}

public class Q5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter File Name: ");
            String fileName = scanner.nextLine();

            try {
                File file = new File(fileName);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }

                System.out.print("Enter number of Students: ");
                int n = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                Student[] students = new Student[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Student " + (i + 1));
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Roll: ");
                    int roll = scanner.nextInt();
                    System.out.print("Score: ");
                    int score = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    Student student = new Student(name, roll, score);
                    students[i] = student;
                }

                try (FileOutputStream fileOut = new FileOutputStream(fileName);
                     ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

                    for (int i = 0; i < n; i++) {
                        objectOut.writeObject(students[i]);
                    }
                    System.out.println("Objects are stored.");
                }

                FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);
                System.out.println("The Objects have been read from the file:");
                for (int i = 0; i < n; i++) {
                    Student student = (Student) objectIn.readObject();
                    System.out.println("Name: " + student.getName() +
                            ", Roll: " + student.getRoll() +
                            ", Score: " + student.getScore());
                }
                objectIn.close();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
