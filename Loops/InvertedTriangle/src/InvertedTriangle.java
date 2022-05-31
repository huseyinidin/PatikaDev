import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        int space = 0, star = 2, line;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        line = input.nextInt();

        for (int i = line; i > 0; i--) {
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = (star * i) - 1; j > 0; j--) {
                System.out.print("*");
            }
            space++;
            System.out.println();
        }
    }
}
