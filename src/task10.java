import java.util.Scanner;
/**
 * This class contains a main method to find the greatest common divisor (GCD) of two numbers.
 */
public class task10 {
    /**
     * The main method takes user input, calculates the GCD of two numbers, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int gcd = findGCD(a, b); // Call to findGCD method
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd);
    }
    /**
     * This method recursively calculates the greatest common divisor (GCD) of two numbers using Euclid's algorithm.
     * Time complexity: O(log(min(a, b))) - where a and b are the input numbers.
     *                  The method divides the larger number by the smaller number repeatedly until the remainder becomes zero,
     *                  which is done in log(min(a, b)) steps.
     *
     * @param a - The first number
     * @param b - The second number
     * @return The greatest common divisor (GCD) of a and b
     */
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        }
        return findGCD(b, a % b); // Recursive call with smaller number and remainder
    }
}
