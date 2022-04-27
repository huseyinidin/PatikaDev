import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        int sum = 0, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect number: " + sum);
        } else
            System.out.println("It's not a perfect number: " + sum);
    }
}
