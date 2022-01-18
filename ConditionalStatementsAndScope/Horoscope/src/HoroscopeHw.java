import java.util.Scanner;

public class HoroscopeHw {

    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month you were born: ");
        month = input.nextInt();

        System.out.print("Enter the day you were born: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Capricorn"; // OGLAK
                } else {
                    horoscope = "Aquarius"; // KOVA
                }
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    horoscope = "Aquarius"; // KOVA
                } else {
                    horoscope = "Pisces"; // BALIK
                }
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    horoscope = "Pisces"; // BALIK
                } else {
                    horoscope = "Aries"; // KOC
                }
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    horoscope = "Aries"; // KOC
                } else {
                    horoscope = "Taurus"; // BOGA
                }
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Taurus"; // BOGA
                } else {
                    horoscope = "Gemini"; // IKIZLER
                }
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    horoscope = "Gemini"; // IKIZLER
                } else {
                    horoscope = "Cancer"; // YENGEC
                }
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Cancer"; // YENGEC
                } else {
                    horoscope = "Leo"; // ASLAN
                }
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "Leo"; // ASLAN
                } else {
                    horoscope = "Virgo"; // BASAK
                }
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 31) {
                if (day < 24) {
                    horoscope = "Virgo"; // BASAK
                } else {
                    horoscope = "Libra"; // TERAZI
                }
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 24) {
                    horoscope = "Libra"; // TERAZI
                } else {
                    horoscope = "Scorpio"; // AKREP
                }
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Scorpio"; // AKREP
                } else {
                    horoscope = "Sagittarius"; // YAY
                }
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "Sagittarius"; // YAY
                } else {
                    horoscope = "Capricorn"; // OGLAK
                }
            }
        }

        System.out.println("Horoscope : " + horoscope);

    }
}
