import java.util.Scanner;
/**
 * This class contains a main method to check if a given string consists of digits only.
 */
public class task8 {
    /**
     * The main method takes user input, checks if the string consists of digits only, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        if (isAllDigits(s)) { // Call to check if all characters are digits
            System.out.println("Yes, the string consists of digits only.");
        } else {
            System.out.println("No, the string contains non-digit characters.");
        }
    }
    /**
     * This method checks if all characters in the given string are digits.
     * Time complexity: O(n) - where n is the length of the string.
     *                  The method iterates over each character in the string once,
     *                  checking if it is a digit or not.
     *
     * @param s - The input string
     * @return true if all characters are digits, false otherwise
     */
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false; // If a non-digit character is found, return false
            }
        }
        return true; // If all characters are digits, return true
    }
}
