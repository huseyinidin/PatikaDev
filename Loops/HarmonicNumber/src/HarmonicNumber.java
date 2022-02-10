import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {

        int n, i;
        double result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of n: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        System.out.println("Result: " + result);
    }
}
