import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = input.nextInt();

        if( year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " A leap year");
        }else if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " A leap year");
        }else
            System.out.println(year + " Not a leap year");
    }
}
