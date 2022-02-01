import java.util.Scanner;

public class TwoPower {

    public static void main(String[] args) {

        int i, n;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of n: ");
        n = input.nextInt();

        for (i = 1; i <= n; i *= 2) {
            System.out.println("Power of two: " + i);
        }
    }
}
