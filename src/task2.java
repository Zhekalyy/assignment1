import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double average = calculateAverage(n, array);

        System.out.println("Average: " + average);

        scanner.close();
    }

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