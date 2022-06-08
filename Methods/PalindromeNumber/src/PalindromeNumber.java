public class PalindromeNumber {

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println(reverseNumber + " This is palindrome a number");
            return true;
        } else {
            System.out.println(reverseNumber + " This isn't palindrome a number");
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(1);
    }
}
