import java.util.Scanner;
/**
 * This class contains a program to find the minimum element in an array of integers.
 */
public class task1 {
    /**
     * This method reads input from the user, creates an array of integers, finds the minimum element in the array,
     * and prints it to the console.
     * 
     * @param args - Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        int min = findMinimum(array);
        System.out.println("The minimum element is: " + min);
        scanner.close();
    }
    /**
     * This method finds and returns the minimum value in a given array of integers.
     * The time complexity for this method is O(n), where n is the number of elements in the array,
     * because each element is visited once.
     * 
     * @param array - The given integer array
     * @return - The minimum value found in the array
     */
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

