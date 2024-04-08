import java.util.Scanner;
/**
 * This class contains a main method to take user input, calculate the average of elements in an array,
 * and a method to calculate the minimum value in the array.
 */
public class task2 {
    /**
     * The main method takes user input, calculates the average of elements in an array,
     * and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        double average = calculateAverage(n, array); // Call to calculate average method
        System.out.println("Average: " + average);
        scanner.close();
    }
    /**
     * This method calculates the average of elements in the given array.
     * Time complexity: O(n) - where n is the number of elements in the array.
     *                  The method iterates through all elements once to calculate the sum.
     *
     * @param n - The number of elements in the array
     * @param array - The array of integers
     * @return The average of elements in the array
     */
    public static double calculateAverage(int n, int[] array) {
        if (n <= 0 || array.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return (double) sum / n;
    }
}
