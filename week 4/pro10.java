import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        double accountValue = 0;

        for (int month = 1; month <= 6; month++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
        }

        System.out.printf("Account value after the sixth month: $%.2f%n", accountValue);
        scanner.close();
    }
}
