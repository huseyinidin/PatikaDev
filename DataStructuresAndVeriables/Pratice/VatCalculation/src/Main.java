import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kdvAmount = 0, kdv = 0.18, result = 0, amount;
        double kdvAMOUNT = 0, KDV = 0.08, RESULT = 0;

        System.out.print("Enter the fee amount: ");
        amount = input.nextDouble();

        if (amount > 0 && amount <= 1000) {
            kdvAmount = amount * kdv;
            result = amount + kdvAmount;
        } else {
            kdvAMOUNT = amount * KDV;
            RESULT = amount + kdvAMOUNT;
        }

        System.out.println("Price without VAT: " + amount);
        System.out.println("VAT rate %18: " + kdv);
        System.out.println("VAT amount: " + kdvAmount);
        System.out.println("Price with VAT: " + result);

        System.out.println("************************");

        System.out.println("Price without VAT: " + amount);
        System.out.println("VAT rate: %8 " + KDV);
        System.out.println("VAT amount: " + kdvAMOUNT);
        System.out.println("Price with VAT: " + RESULT);
    }
}
