import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        if (size > 0) {
            int[] arr = new int[size];
            System.out.println("Enter the numbers of the array");
            for (int i = 0; i < size; i++) {
                System.out.printf("%d. number: ", i + 1);
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Sorting: " + Arrays.toString(arr));
        }
    }
}
