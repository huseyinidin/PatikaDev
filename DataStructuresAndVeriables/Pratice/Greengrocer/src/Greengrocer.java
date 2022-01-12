import java.util.Scanner;

public class Greengrocer {

    public static void main(String[] args) {

        double p,a,t,b,e, total;
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("How much pear? ");
        p = input.nextDouble();

        System.out.print("How much apple? ");
        a = input.nextDouble();

        System.out.print("How much tomato? ");
        t = input.nextDouble();

        System.out.print("How much banana? ");
        b = input.nextDouble();

        System.out.print("How much eggplant? ");
        e = input.nextDouble();

        total = (pear * p) + (apple * a) + (tomato * t) + (banana * b) + (eggplant * e);

        System.out.println("Total Price: " + total);
    }
}
