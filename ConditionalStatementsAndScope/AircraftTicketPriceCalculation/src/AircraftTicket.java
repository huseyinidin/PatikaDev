import java.util.Scanner;

public class AircraftTicket {

    public static void main(String[] args) {

        int     distance,
                age,
                typeOfTrip;

        double  discountForKids = 0.50,
                discountForAdults = 0.10,
                discountForOlds = 0.30,
                discountRoundTrip = 0.20,
                perKm = 0.10,
                discount,
                totalPrice = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        distance = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Type of trip: 1- One way 2- Round trip: ");
        typeOfTrip = input.nextInt();

        if ((distance > 0 && age > 0) && (typeOfTrip == 1 || typeOfTrip == 2)) {
            totalPrice = distance * perKm;

            if (age < 12) {
                discount = totalPrice * discountForKids;
                totalPrice -= discount;
                if (typeOfTrip == 2) {
                    discount = totalPrice * discountRoundTrip;
                    totalPrice -= discount;
                    totalPrice = totalPrice * 2;
                }
            } else if (age <= 24) {
                discount = totalPrice * discountForAdults;
                totalPrice -= discount;
                if (typeOfTrip == 2) {
                    discount = totalPrice * discountRoundTrip;
                    totalPrice -= discount;
                    totalPrice = totalPrice * 2;
                }
            } else if (age > 65) {
                discount = totalPrice * discountForOlds;
                totalPrice -= discount;
                if (typeOfTrip == 2) {
                    discount = totalPrice * discountRoundTrip;
                    totalPrice -= discount;
                    totalPrice = totalPrice * 2;
                }
            }
            System.out.println("Total price: " + totalPrice);
        } else {
            System.out.println("You have entered incorrect data! Try again.");
        }
    }
}

