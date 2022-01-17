import java.util.Scanner;

public class SuggestAnEvent {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Activities by temperature of air");

        System.out.println("Enter temperature");
        heat = input.nextInt();
        switch (heat) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("You can go skiing.");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("You can go cinema.");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("You can go cinema or picnic.");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                System.out.println("You can go picnic.");
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                System.out.println("You can go swimming.");
                break;
            default:
                System.out.println("Stay at home.");
        }
    }
}
