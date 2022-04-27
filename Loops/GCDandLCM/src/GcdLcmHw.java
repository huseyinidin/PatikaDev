import java.util.Scanner;

public class GcdLcmHw {
    public static void main(String[] args) {
        int n1, n2, gcd = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of n1: ");
        n1 = input.nextInt();

        System.out.print("Enter the number of n2: ");
        n2 = input.nextInt();

        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("Greatest common divisor: " + gcd);

        System.out.println("-------------");

        i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest common divisor: " + gcd);

        System.out.println("Least common multiple: " + (n1 * n2 / gcd));


    }
}
