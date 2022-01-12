import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        int a, b;
        double c, u, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first edge: ");
        a = input.nextInt();

        System.out.print("Enter the second edge: ");
        b = input.nextInt();

        System.out.print("Enter the third edge: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Area of triangle: " + area);
    }
}
