import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {2, 8, 1, 7, 24, 6, 3, 15, 8, 12, 14, 7, 4, 2, 6, 24, 1, 3, 5, 14};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        Arrays.sort(duplicate);
        for (int value : duplicate) {
            if (value != 0 && value % 2 == 0) {
                System.out.println(value);
            }
        }
    }
}