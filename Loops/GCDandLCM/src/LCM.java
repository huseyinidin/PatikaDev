import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // Least common multiple
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of n1: ");
        n1 = input.nextInt();

        System.out.print("Enter the number of n2: ");
        n2 = input.nextInt();

        for (int i = 1; i < (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
