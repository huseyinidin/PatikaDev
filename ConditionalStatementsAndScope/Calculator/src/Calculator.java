import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int num1, num2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.println("1- Plus\n2- Minus\n3- Multiply\n4- Divided");
        System.out.print("Your coise: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Plus: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Minus: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiply: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Divided: " + (num1 / num2));
                } else {
                    System.out.println("a number can't be divided by ");
                }
                break;
            default:
                System.out.println("You entered incorrectly");
        }
    }
}
