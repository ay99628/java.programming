import java.util.Scanner;
import java.text.DecimalFormat;
public class pro11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        double tax = amount * 0.06;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Sales Tax: $" + df.format(tax));
        scanner.close();
    }
}
