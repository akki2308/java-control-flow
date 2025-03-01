import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ages of Amar, Akbar, Anthony: ");
        int ageAmar = sc.nextInt(), ageAkbar = sc.nextInt(), ageAnthony = sc.nextInt();

        System.out.print("Enter heights of Amar, Akbar, Anthony: ");
        int heightAmar = sc.nextInt(), heightAkbar = sc.nextInt(), heightAnthony = sc.nextInt();

        String youngest;
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar < ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar > heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        sc.close();
    }
}
