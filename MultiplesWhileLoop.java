import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (positive integer less than 100): ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 99; // Start from 99 and go down

            System.out.println("Multiples of " + number + " below 100:");
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--;
            }
        } else {
            System.out.println("Please enter a valid number (1 to 99).");
        }

        sc.close();
    }
}
