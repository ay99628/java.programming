import java.util.Scanner;
public class pro6 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter weight in pounds: ");
            double weight = sc.nextDouble();

            System.out.print("Enter height in inches: ");
            double height = sc.nextDouble();

            final double KILLOGRAMS_PER_POUND = 0.45359237;
            final double METER_PER_INCH = 0.0254;

            double weightInKillograms = weight * KILLOGRAMS_PER_POUND;
            double heightInMeter = height * METER_PER_INCH;
            double bmi = weightInKillograms / heightInMeter / heightInMeter;

            System.out.println("BMI is " + bmi);
            if (bmi < 18.5) {
                System.out.println("You are underweight");
            } else if (bmi < 25) {
                System.out.println("You are normal");
            } else if (bmi < 30) {
                System.out.println("You are overweight");
            } else
                System.out.println("You are obese");
        }
    }


