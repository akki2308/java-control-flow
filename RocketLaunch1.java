import java.util.Scanner;

public class RocketLaunch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();

        scanner.close();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Blast Off!");
    }
}
