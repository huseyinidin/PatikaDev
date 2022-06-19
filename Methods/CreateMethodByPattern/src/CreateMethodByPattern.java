import java.util.Scanner;

public class CreateMethodByPattern {

    static int minus(int x) {
        if (x <= 0) {
            return x;
        } else {
            System.out.print(x + " ");
            return minus(x - 5);
        }
    }

    static int sum(int x, int y) {
        if (x > y) {
            return x;
        } else {
            System.out.print(x + " ");
            return sum(x + 5, y);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        sum(minus(number), number);

    }


}
