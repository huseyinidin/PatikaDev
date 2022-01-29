import java.util.Scanner;

public class SumOfOddNumbersHW {

    public static void main(String[] args) {

        int n, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number : ");
            n = input.nextInt();
            if (n % 4 == 0 && n % 2 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.print("Total: " + (total));
    }
}
