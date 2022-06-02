import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int a = 0, b = 1;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fib = input.nextInt();

        for (int i = 1; i <= fib; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
