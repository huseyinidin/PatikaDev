import java.util.Scanner;

public class FindEvenNumbers {

    public static void main(String[] args) {

        int k, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
