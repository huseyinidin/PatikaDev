import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {

        int n, r, i, nTotal = 1, rTotal = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of n: ");
        n = input.nextInt();

        System.out.print("Enter a number of r: ");
        r = input.nextInt();

        if (n >= r) {
            nTotal = n;
            for (i = 1; i < r; i++) {
                nTotal *= (n - i);
            }
            for (i = 1; i <= r; i++) {
                rTotal *= i;
            }
        } else {
            System.out.println("Number r can't be greater than number n.");
        }

        System.out.println("C (" + n + "," + r + ") = " + nTotal / rTotal);


    }
}
