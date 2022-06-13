import java.util.Scanner;

public class AdvancedCalculator {

    static int addition(int a, int b) {
        int result = a + b;
        System.out.println("Result: " + result);
        return result;
    }

    static int subraction(int a, int b) {
        int result = a - b;
        System.out.println("Result: " + result);
        return result;
    }

    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Result: " + result);
        return result;
    }

    static int division(int a, int b) {
        int result = 0;
        if (b != 0) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("a number can't be divided by zero");
        }
        return result;
    }

    static int powered(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rectangle(int a, int b) {
        System.out.println("Circle result: " + (a + b) * 2);
        System.out.println("Area result: " + a * b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Addition:\n"
                + "2- Subraction:\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Powered number calculate\n"
                + "6- Mod\n"
                + "7- Calculate the area and perimeter of a rectangle\n"
                + "8- Exit";
        System.out.println(menu);
        while (true) {
            System.out.print("Select an action:");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("First number: ");
            int a = input.nextInt();
            System.out.print("Second number: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    addition(a, b);
                    break;
                case 2:
                    subraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    System.out.println("Result: " + powered(a, b));
                    break;
                case 6:
                    System.out.println("Result: " + mod(a, b));
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("You made an incorrect entry! try again. ");
            }
        }
    }
}
