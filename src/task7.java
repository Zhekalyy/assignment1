import java.util.Scanner;
/**
 * This class contains a main method to reverse an array of integers.
 */
public class task7 {
    /**
     * The main method takes user input to populate an array, reverses it, and prints the reversed array.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        reverseArray(array, 0, n - 1); // Call to reverseArray method
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    /**
     * This method recursively reverses the elements of the given array.
     * Time complexity: O(n/2) = O(n) - where n is the number of elements in the array.
     *                  The method iterates over half of the array swapping elements, resulting in linear time complexity.
     *
     * @param arr - The array to be reversed
     * @param start - The starting index of the subarray
     * @param end - The ending index of the subarray
     */
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1); // Recursive call to reverse the subarray
    }
}
