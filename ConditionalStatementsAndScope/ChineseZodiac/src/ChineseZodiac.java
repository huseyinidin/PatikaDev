import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        int year, zodiac;
        String horoscope = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you were born: ");
        year = input.nextInt();

        zodiac = year % 12;

        switch (zodiac) {
            case 0:
                horoscope = "Monkey";
                break;
            case 1:
                horoscope = "Rooster";
                break;
            case 2:
                horoscope = "Dog";
                break;
            case 3:
                horoscope = "Pig";
                break;
            case 4:
                horoscope = "Rat";
                break;
            case 5:
                horoscope = "Ox";
                break;
            case 6:
                horoscope = "Tiger";
                break;
            case 7:
                horoscope = "Rabbit";
                break;
            case 8:
                horoscope = "Dragon";
                break;
            case 9:
                horoscope = "Snake";
                break;
            case 10:
                horoscope = "Horse";
                break;
            case 11:
                horoscope = "Goat";
                break;
            default:
                System.out.println("You have entered incorrectly, try again.");
        }
        System.out.println("Horoscope: " + horoscope);

    }
}
