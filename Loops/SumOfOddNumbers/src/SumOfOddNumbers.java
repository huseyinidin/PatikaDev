import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        int n, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number : ");
            n = input.nextInt();
            if (n % 2 == 1) {
                total += n;
            }
        } while (n > 0);

        System.out.print("Total: " + (total));
    }
}
