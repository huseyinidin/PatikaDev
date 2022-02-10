import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int number, basValue = 0, result = 0, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        int tempNumber = number;
        int tempNumber1 = number;

        while (tempNumber > 0) {
            tempNumber /= 10;
            basValue++;
        }
        while (number > 0) {
            result = number % 10;
            total += Math.pow(result, basValue);
            number /= 10;
        }
        if (total == tempNumber1) {
            System.out.println("The number " + total + " is an armstrong number.");
        } else
            System.out.println("The number " + total + " isn't an armstrong number.");
    }
}
