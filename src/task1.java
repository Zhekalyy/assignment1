import java.util.Scanner;

public class task1 {
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
