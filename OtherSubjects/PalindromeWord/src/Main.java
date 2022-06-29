import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return str.equals(reverse.toString());
    }

    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        word = scanner.nextLine();
        System.out.println(isPalindrome(word));
    }
}