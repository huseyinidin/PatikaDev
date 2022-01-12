import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first edge: ");
        a = input.nextInt();

        System.out.print("Enter the second edge: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse: " + c);

        /*Benim yazdığım yol

        c = (a*a) + (b*b);
        result = c/5;
        System.out.println(result);*/
    }
}
