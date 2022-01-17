import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        int math, physics, chemistry, turkish, music;
        int lesson1, lesson2, lesson3, lesson4, lesson5, average;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the math note: ");
        math = input.nextInt();

        System.out.print("Enter the physics note: ");
        physics = input.nextInt();

        System.out.print("Enter the chemistry note: ");
        chemistry = input.nextInt();

        System.out.print("Enter the turkish note: ");
        turkish = input.nextInt();

        System.out.print("Enter the music note: ");
        music = input.nextInt();

        lesson1 = (math >= 0 && math <= 100) ? math : 0;

        lesson2 = (physics >= 0 && physics <= 100) ? physics : 0;

        lesson3 = (chemistry >= 0 && chemistry <= 100) ? chemistry : 0;

        lesson4 = (turkish >= 0 && turkish <= 100) ? turkish : 0;

        lesson5 = (music >= 0 && music <= 100) ? music : 0;

        average = (lesson1 + lesson2 + lesson3 + lesson4 + lesson5) / 5;

        if (average >= 55) {
            System.out.println("You passed the class");
        } else {
            System.out.println("You failed the class");
        }
        System.out.println("Your average: " + average);

    }
}
