import java.util.Scanner;

public class ExponentialNumbersHw {

    public static void main(String[] args) {

        int n, k, i, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of soles: ");
        n = input.nextInt();

        System.out.print("Enter exponent: ");
        k = input.nextInt();

        for (i = 1; i <= k ; i++) {
            total *= n;
        }
        System.out.println("Total: " + total);
    }
}
