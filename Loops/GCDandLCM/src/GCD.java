import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // Greatest common divisor

        int n1, n2, gcd = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of n1: ");
        n1 = input.nextInt();

        System.out.print("Enter the number of n2: ");
        n2 = input.nextInt();

        //looped in 18 times
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
        System.out.println("-------------");

        //looped in 13 times
        for (int k = n1; k >= 1; k--) {
            System.out.println(k);
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
                System.out.println(gcd);
                break;
            }
        }
    }
}
