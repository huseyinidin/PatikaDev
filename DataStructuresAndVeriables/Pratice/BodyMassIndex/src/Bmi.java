import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {

        double height, weight, bmi;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height: ");
        height = input.nextDouble();

        System.out.print("please enter your weight: ");
        weight = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your body mass index: " + bmi);

    }
}
