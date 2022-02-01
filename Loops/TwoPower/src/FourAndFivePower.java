import java.util.Scanner;

public class FourAndFivePower {

    public static void main(String[] args) {

        int i, j, n;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of n: ");
        n = input.nextInt();

        for (i = 1; i <= n; i *= 4) {
            System.out.println("Power of four: " + i);
        }

        System.out.println("++++++++++++++++++++++");

        for (j = 1; j <= n; j *= 5) {
            System.out.println("Power of five: " + j);
        }
    }
}
