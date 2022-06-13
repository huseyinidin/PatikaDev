import java.util.Scanner;

public class Calculatorr {

    public static void main(String[] args) {

        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.println("1- Plus\n2- Minus\n3- Multiply\n4- Divided");
        System.out.print("Select an action: ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("Plus: " + (num1 + num2));
        } else if (select == 2) {
            System.out.println("Minus: " + (num1 - num2));
        } else if (select == 3) {
            System.out.println("Minus: " + (num1 - num2));
        } else if (select == 4) {
            if (num2 != 0) {
                System.out.println("Divided: " + (num1 / num2));
            } else {
                System.out.println("a number can't be divided by zero");
            }
        } else {
            System.out.println("You entered incorrectly");
        }
    }
}
