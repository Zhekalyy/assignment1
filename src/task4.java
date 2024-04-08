import java.util.Scanner;
/**
 * This class contains a main method to calculate the factorial of a given number.
 */
public class task4 {
    /**
     * The main method takes user input, calculates the factorial of the input number, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long factorial = calculateFactorial(n); // Call to calculate factorial method
        System.out.println(n + "! = " + factorial);
        scanner.close();
    }
    /**
     * This method calculates the factorial of a given non-negative integer.
     * Time complexity: O(n) - where n is the given number.
     *                  The method uses recursion to calculate the factorial,
     *                  making n function calls until it reaches the base case of n = 0 or n = 1.
     *
     * @param n - The number whose factorial is to be calculated
     * @return The factorial of n
     */
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1); // Recursive call to calculate factorial
        }
    }
}

