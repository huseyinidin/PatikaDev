import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int n, i, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a factorial number: ");
        n = input.nextInt();

        for (i = n; i > 1; i--) {
            total *= i;
        }
        System.out.println(n + " factorial: " + total);
    }
}
