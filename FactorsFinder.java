import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("Factors of " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
