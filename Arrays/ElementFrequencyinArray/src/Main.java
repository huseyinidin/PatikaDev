import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 8, 4, 8, 1, 2, 3, 2, 2, 5, 4};
        int count = 0;
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j : list) {
                if (list[i] == j) {
                    count++;
                }
            }
            if (i == 0 && list[i + 1] == list[i]) {
                System.out.printf("The number %d has been repeated %d times\n", list[i], count);
            }
            if (i == 0 && list[i + 1] != list[i]) {
                System.out.printf("The number %d has been repeated %d times\n", list[i], count);
            }
            if (i != 0 && list[i - 1] != list[i]) {
                System.out.printf("The number %d has been repeated %d times\n", list[i], count);
            }
        }
    }
}
