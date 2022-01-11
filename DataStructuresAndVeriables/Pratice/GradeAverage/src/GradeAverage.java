import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        int math, physics, chemistry, turkish, history, music;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the math note: ");
        math = input.nextInt();

        System.out.println("Enter the physics note: ");
        physics = input.nextInt();

        System.out.println("Enter the chemistry note: ");
        chemistry = input.nextInt();

        System.out.println("Enter the turkish note: ");
        turkish = input.nextInt();

        System.out.println("Enter the history note: ");
        history = input.nextInt();

        System.out.println("Enter the music note: ");
        music = input.nextInt();

        int total = (math + physics + chemistry + turkish + history + music);
        double result = total / 6.0;

        System.out.println("Your average: " + result);

        String str = (result >= 60) ? "Passed" : "Left";

        System.out.println("Status: " + str);

    }
}
