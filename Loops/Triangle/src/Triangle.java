import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int space, star, line;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        line = input.nextInt();
        space = line / 2;
        star = 1;

        if (line % 2 == 1) {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int c = 0; c < star; c++) {
                    System.out.print("*");
                }

                if (i < line / 2) {
                    space--;
                    star += 2;
                } else {
                    space++;
                    star -= 2;
                }
                System.out.println();
            }
        } else {

            System.out.println("Incremented by one because the number entered is double\n");

            line = line % 2 == 0 ? line + 1 : line;

            for (int i = 0; i < line; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int c = 0; c < star; c++) {
                    System.out.print("*");
                }

                if (i < line / 2) {
                    space--;
                    star += 2;
                } else {
                    space++;
                    star -= 2;
                }
                System.out.println();
            }
        }
    }
}