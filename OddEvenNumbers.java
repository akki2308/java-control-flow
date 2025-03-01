import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number < 1) {
            System.out.println("Please enter a natural number (1 or greater).");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.printf("%d is an even number%n", i);
                } else {
                    System.out.printf("%d is an odd number%n", i);
                }
            }
        }
    }
}
