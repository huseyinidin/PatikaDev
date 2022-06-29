import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many wrong entries. Right: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("If you make a wrong entry again, you will lose your right.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! Estimated number: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You have entered an incorrect number!");
                if (selected > number) {
                    System.out.println(selected + " The number, is greater than the hidden number.");
                } else {
                    System.out.println(selected + " The number, is less than hidden number");
                }
                wrong[right++] = selected;
                System.out.println("Right : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost!");
            System.out.println("Your predictions: " + Arrays.toString(wrong));
        }
    }
}