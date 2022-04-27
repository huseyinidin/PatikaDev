import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        int min = 0, max = 0, temp, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". number is: ");
            temp = input.nextInt();
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
