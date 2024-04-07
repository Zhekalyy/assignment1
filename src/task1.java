import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input the elements
        int[] array = new int[n];
        System.out.println("Enter the elements one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the minimum element
        int min = findMinimum(array);

        // Print the minimum element
        System.out.println("The minimum element is: " + min);

        scanner.close();
    }

    // Function to find the minimum element in the array
    public static int findMinimum(int[] array) {
        // Assume the first element is the minimum
        int min = array[0];

        // Iterate through the array to find the minimum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Return the minimum element
        return min;
    }
}
