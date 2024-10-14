import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindromeString = isPalindrome(input);

        if (isPalindromeString) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + "15" + " is not a palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
