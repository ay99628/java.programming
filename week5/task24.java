import java.util.Scanner;
public class task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine().toLowerCase(); // Convert to lowercase for consistency

        // Check if the input is a single letter
        if (letter.length() == 1 && Character.isLetter(letter.charAt(0))) {
            char ch = letter.charAt(0);

            // Determine if the letter is a vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
