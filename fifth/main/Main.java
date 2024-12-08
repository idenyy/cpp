package fifth.main;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number (it must be positive):");
            int number = scanner.nextInt();
            checkNumber(number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting ArrayStoreException...");
            Object[] array = new String[5];
            array[0] = 10;
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting StringIndexOutOfBoundsException...");
            String str = "hello";
            char result = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        scanner.close();
    }

    public static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("The number cannot be negative.");
        } else {
            System.out.println("Number is valid.");
        }
    }
}
