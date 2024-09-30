import java.util.Scanner;
public class pro14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInInches = scanner.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;

        double heightInMeters = heightInInches * 0.0254;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        scanner.close();
    }
}
