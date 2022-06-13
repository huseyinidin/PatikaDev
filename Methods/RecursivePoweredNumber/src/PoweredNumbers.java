import java.util.Scanner;

public class PoweredNumbers {

    static int poweredNumbers(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * poweredNumbers(a, b - 1);
    }

    public static void main(String[] args) {

        //System.out.println(poweredNumbers(2,3));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int a = input.nextInt();
        System.out.print("Enter the exponent value: ");
        int b = input.nextInt();
        System.out.println("Result: " + poweredNumbers(a, b));


    }
}
