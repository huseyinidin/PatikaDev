import java.util.Scanner;

public class RecursivePrimeNumber {

    static boolean isPrime(int n, int i) {

        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (isPrime(n, 2))
            System.out.println("Yes it's a Prime");
        else
            System.out.println("Not a Prime");
    }
}

