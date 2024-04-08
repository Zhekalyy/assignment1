import java.util.Scanner;
/**
 * This class contains a main method to check whether a given number is prime or composite.
 */
public class task3 {

    /**
     * The main method takes user input, checks if the number is prime or composite, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is a Composite number.");
        }
        scanner.close();
    }
    /**
     * This method checks if a given number is prime.
     * Time complexity: O(sqrt(n)) - where n is the given number.
     *                  The method iterates from 2 to the square root of n to check divisibility,
     *                  so the time complexity is proportional to the square root of the input number.
     *
     * @param n - The number to be checked
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
