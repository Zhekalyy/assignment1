import java.util.Scanner;
/**
 * This class contains a main method to calculate the power of a number.
 */
public class task6 {
    /**
     * The main method takes user input, calculates the power of the input number, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        long result = calculatePower(a, n); // Call to calculate power method
        System.out.println(a + "^" + n + " = " + result);
        scanner.close();
    }
    /**
     * This method calculates the power of a given number using iteration.
     * Time complexity: O(n) - where n is the exponent.
     *                  The method iterates 'n' times to calculate the power, multiplying 'a' each time.
     *
     * @param a - The base
     * @param n - The exponent
     * @return The result of a raised to the power of n
     */
    public static long calculatePower(int a, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= a; // Multiply 'a' 'n' times
        }
        return result;
    }
}
