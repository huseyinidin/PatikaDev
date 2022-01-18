import java.util.Scanner;

public class Horoscope {

    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month you were born: ");
        month = input.nextInt();

        System.out.print("Enter the day you were born: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Capricorn"; // OGLAK
                    } else {
                        horoscope = "Aquarius"; // KOVA
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horoscope = "Aquarius"; // KOVA
                    } else {
                        horoscope = "Pisces"; // BALIK
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Pisces"; // BALIK
                    } else {
                        horoscope = "Aries"; // KOC
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Aries"; // KOC
                    } else {
                        horoscope = "Taurus"; // BOGA
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Taurus"; // BOGA
                    } else {
                        horoscope = "Gemini"; // IKIZLER
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horoscope = "Gemini"; // IKIZLER
                    } else {
                        horoscope = "Cancer"; // YENGEC
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Cancer"; // YENGEC
                    } else {
                        horoscope = "Leo"; // ASLAN
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Leo"; // ASLAN
                    } else {
                        horoscope = "Virgo"; // BASAK
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 24) {
                        horoscope = "Virgo"; // BASAK
                    } else {
                        horoscope = "Libra"; // TERAZI
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        horoscope = "Libra"; // TERAZI
                    } else {
                        horoscope = "Scorpio"; // AKREP
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Scorpio"; // AKREP
                    } else {
                        horoscope = "Sagittarius"; // YAY
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Sagittarius"; // YAY
                    } else {
                        horoscope = "Capricorn"; // OGLAK
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız tekrar deneyin.");
        } else {
            System.out.println("burcunuz: " + horoscope);
        }
    }
}
