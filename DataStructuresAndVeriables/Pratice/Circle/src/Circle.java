import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        int r;
        double pi = 3.14, area, environment;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        r = input.nextInt();

        area = pi * r * r;
        environment = 2 * pi * r;

        System.out.println("area: " + area);
        System.out.println("enviroment: " + environment);


    }
}
