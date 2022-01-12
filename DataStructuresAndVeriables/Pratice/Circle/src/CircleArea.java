import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        int r, angle;
        double pi = 3.14, area, environment;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        r = input.nextInt();

        System.out.print("Enter angle value: ");
        angle = input.nextInt();

        area = (pi * ( r * r) * angle) / 360;

        System.out.println("area: " + area);



    }
}
