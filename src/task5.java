import java.util.Scanner;
/**
 * This class contains a main method to find the nth Fibonacci number.
 */
public class task5 {
    /**
     * The main method takes user input, calculates the nth Fibonacci number, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int result = findFibonacci(n); // Call to find Fibonacci number method
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        scanner.close();
    }
    /**
     * This method finds the nth Fibonacci number recursively.
     * Time complexity: O(2^n) - Exponential time complexity.
     *                  The method recursively calls itself twice (n-1) and (n-2) times until it reaches the base cases.
     *                  This leads to an exponential increase in the number of function calls and computations.
     *
     * @param n - The index of the Fibonacci number to find
     * @return The nth Fibonacci number
     */
    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2); // Recursive calls to find Fibonacci numbers
    }
}

