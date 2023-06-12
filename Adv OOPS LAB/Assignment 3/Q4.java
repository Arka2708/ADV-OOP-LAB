/*Q4. Write a program to create a text file to store a list of names and then read
 the content.*/
 import java.io.File;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Scanner;
 
 public class Q4 {
     public static void main(String[] args) {
         System.out.print("Enter File Name: ");
         try (Scanner scanner = new Scanner(System.in)) {
             String fileName = scanner.nextLine();
             try {
                 File file = new File(fileName);
                 if (file.createNewFile()) {
                     System.out.println("File created: " + file.getName());
                 } else {
                     System.out.println("File already exists.");
                 }
 
                 FileWriter fileWriter = new FileWriter(file);
                 System.out.print("Enter the number of names you want to store: ");
                 int n = scanner.nextInt();
                 scanner.nextLine(); // Consume the newline character
 
                 for (int i = 1; i <= n; i++) {
                     System.out.print("Enter Name " + i + ": ");
                     String name = scanner.nextLine();
                     fileWriter.write(name);
                     fileWriter.write("\n");
                 }
 
                 fileWriter.close();
 
                 Scanner fileReader = new Scanner(file);
                 System.out.println("Content of the file:");
                 while (fileReader.hasNextLine()) {
                     String data = fileReader.nextLine();
                     System.out.println(data);
                 }
                 fileReader.close();
             } catch (IOException e) {
                 System.out.println("An error occurred.");
                 e.printStackTrace();
             }
         }
     }
 }
 
