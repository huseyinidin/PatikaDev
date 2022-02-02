import java.util.Scanner;

public class ExponentialNumbers {

    public static void main(String[] args) {

        int n, k, i = 1, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of soles: ");
        n = input.nextInt();

        System.out.print("Enter exponent: ");
        k = input.nextInt();

        while (i <= k) {
            total *= n;
            i++;
        }
        System.out.println("Total: " + total);
    }
}
