package third.main;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array (n): ");
            int n = scanner.nextInt();
            double[] array = new double[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextDouble();
            }

            double product = 1.0;
            boolean found = false;

            for (int i = 0; i < n; i++) {
                int index = i + 1;
                double factorial = factorial(index);

                if (index + 1 < array[i] && array[i] < factorial) {
                    product *= array[i];
                    found = true;
                }
            }

            if (found) {
                double result = 1 / product;
                System.out.printf("Inverse of the product is: %.6f%n", result);
            } else {
                System.out.println("No elements meet the condition.");
            }
        }
    }

    private static double factorial(int num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
