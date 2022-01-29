import java.util.Scanner;

public class FindEvenNumbersHW {

    public static void main(String[] args) {

        int k, i = 1;
        int result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                result += i;
            }
        }
        System.out.println(result / 2);

       /*

       while (i <= k) {
            if (i % 3 == 0 && i % 4 == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result / 2);
        
       */
    }
}
