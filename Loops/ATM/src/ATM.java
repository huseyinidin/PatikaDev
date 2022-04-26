import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("Patika") && password.equals("dev123")) {
                System.out.println("Hello, welcome to the Kodluyoruz Bank!");

                do {
                    System.out.println("1- Deposit\n" +
                            "2- Withdrawal\n" +
                            "3- Balance inquiry\n" +
                            "4- Exit");
                    System.out.print("Please select the action you want to do. ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Amount of money: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Current balance: " + balance);
                    } else if (select == 2) {
                        System.out.println("Amount of money: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance. "+ balance + " Withdrawable amount");
                        } else {
                            balance -= price;
                            System.out.println("remaining balance: " + balance);
                        }
                    } else if (select == 3) {
                        System.out.println("Balance : " + balance);
                    }
                } while (select != 4);
                System.out.println("See you soon.");
                break;
            } else {
                right--;
                System.out.println("You entered an incorrect password.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the Bank.");
                } else {
                    System.out.println("Try again: " + right);
                }
            }
        }
    }
}
