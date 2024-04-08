import java.util.Scanner;
/**
 * This class contains a main method to calculate the binomial coefficient.
 */
public class task9 {
    /**
     * The main method takes user input, calculates the binomial coefficient, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        int result = binomialCoefficient(n, k); // Call to binomialCoefficient method
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }
    /**
     * This method calculates the binomial coefficient using recursion.
     * Time complexity: O(2^n) - Exponential time complexity.
     *                  The method recursively calls itself twice (n-1, k-1) and (n-1, k) times until it reaches the base cases.
     *                  This leads to an exponential increase in the number of function calls and computations.
     *
     * @param n - The total number of items
     * @param k - The number of items to choose
     * @return The binomial coefficient C(n, k)
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base cases: C(n, 0) = C(n, n) = 1
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k); // Recursive calculation of binomial coefficient
        }
    }
}

