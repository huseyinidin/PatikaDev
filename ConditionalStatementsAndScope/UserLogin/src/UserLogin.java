import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        String userName, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the username: ");
        userName = input.nextLine();

        System.out.print("Enter the password: ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("Patika123")) {
            System.out.println("Entry successful");
        } else {
            System.out.println("You entered an incorrect password");
            System.out.println("1- Change your password");

            select = input.nextInt();

            if (select == 1) {
                System.out.println("Type your new password" + input.nextLine());
                newPassword = input.nextLine();
                if (newPassword.equals("Patika123")) {
                    System.out.println("Passwords can't be the same, enter a different password");
                } else {
                    System.out.println("New password created successfully");
                    System.out.println("Remember to save your password!");
                }
            }
        }

    }
}
