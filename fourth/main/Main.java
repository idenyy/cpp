package fourth.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);

        System.out.println("\nEnter the number of tasks (Nsum):");
        int Nsum = scanner.nextInt();
        int Nv = 9;
        int N2 = calculateN2(Nsum, Nv);

        System.out.println("N2 = Nsum - Nv = " + N2);
        
        scanner.close();
    }

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static int calculateN2(int Nsum, int Nv) {
        return Nsum - Nv;
    }
}

