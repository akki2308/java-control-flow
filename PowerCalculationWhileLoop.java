import java.util.Scanner;

public class PowerCalculationWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        if (number >= 0 && power >= 0) {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter non-negative integers for base and power.");
        }

        sc.close();
    }
}
