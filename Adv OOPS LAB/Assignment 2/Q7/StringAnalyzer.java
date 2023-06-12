package Q7;
import java.util.*;
/*Q7.  Take a string input that contains multiple words. Do the following:
 * i) Number of times 'a' appears.
 * ii) Number of times "and" appears.
 * iii) Whether it starts with "The" or not
 * iv) Convert the string into an array of characters
 * v) Display the tokens in the string(tokens are substrings separated by space or @ or .)
 */
public class StringAnalyzer {
    public static void main(String[] args) {
        String input = "The@gmail.com";

        // Number of times 'a' appears
        int aCount = countCharacter(input, 'a');
        System.out.println("Number of times 'a' appears: " + aCount);
        System.out.println("");

        // Number of times "and" appears
        int andCount = countSubstring(input, "and");
        System.out.println("Number of times 'and' appears: " + andCount);
        System.out.println("");

        // Whether it starts with "The" or not
        boolean startsWithThe = input.startsWith("The");
        System.out.println("Starts with 'The': " + startsWithThe);
        System.out.println("");

        // Convert the string into an array of characters
        char[] charArray = input.toCharArray();
        System.out.println("Array of characters: " + Arrays.toString(charArray));
        System.out.println("");

        // Display the tokens in the string
        String[] tokens = input.split("[ @.]");
        System.out.println("Tokens in the string: " + Arrays.toString(tokens));
        System.out.println("");
    }

    private static int countCharacter(String input, char c) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    private static int countSubstring(String input, String substring) {
        int count = 0;
        int index = input.indexOf(substring);
        while (index != -1) {
            count++;
            index = input.indexOf(substring, index + substring.length());
        }
        return count;
    }
}