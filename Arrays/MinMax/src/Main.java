import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = list[0];
        int max = list[0];
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(list));
        System.out.print("Enter a number: ");
        number = input.nextInt();

        Arrays.sort(list);
        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

    }
}
