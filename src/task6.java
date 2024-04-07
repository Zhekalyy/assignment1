import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        long result = calculatePower(a, n);
        System.out.println(a + "^" + n + " = " + result);
        scanner.close();
    }
    public static long calculatePower(int a, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}
