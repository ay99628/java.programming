import java.util.Scanner;
public class task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = input.nextInt();

        // Check if the input is valid
        if (decimalValue < 0 || decimalValue > 15) {
            System.out.println(decimalValue + " is an invalid input.");
        } else {
            // Convert to hexadecimal and display the result
            String hexValue = Integer.toHexString(decimalValue).toUpperCase();
            System.out.println("The hex value is: " + hexValue);
        }
    }
}
