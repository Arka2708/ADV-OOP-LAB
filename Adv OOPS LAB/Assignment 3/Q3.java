/* Q3. Write a program that takes a filename from user and checks whether it exists or not. 
If it exists then check whether it is a directory or not. 
If it is a directory then show the list of files in it. 
If it is not a directory then show whether it can be read and/or written into.*/
import java.io.File;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("1: Create a file");
        System.out.println("2: Create a directory");
        System.out.println("3: Continue without creating anything");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter File Name: ");
                scanner.nextLine();
                String fileName = scanner.nextLine();
                try {
                    File file = new File(fileName);
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            } else if (choice == 2) {
                System.out.print("Enter Directory Name: ");
                scanner.nextLine();
                String directoryName = scanner.nextLine();
                File directory = new File(directoryName);
                if (directory.mkdir()) {
                    System.out.println("Directory created: " + directory.getName());
                } else {
                    System.out.println("Directory already exists.");
                }
            }

            System.out.print("Enter File Name to check: ");
            String fileName = scanner.nextLine();
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File doesn't exist.");
            } else {
                System.out.println("File exists.");
                if (file.isDirectory()) {
                    System.out.println("It's a directory.");
                    String[] contents = file.list();
                    System.out.println("List of files and directories in the specified directory:");
                    for (String content : contents) {
                        System.out.println(content);
                    }
                } else {
                    System.out.println("It's not a directory.");
                    if (file.canRead()) {
                        System.out.println("It can be read.");
                    } else {
                        System.out.println("It can't be read.");
                    }
                    if (file.canWrite()) {
                        System.out.println("It can be written to.");
                    } else {
                        System.out.println("It can't be written to.");
                    }
                }
            }
        }
    }
}
