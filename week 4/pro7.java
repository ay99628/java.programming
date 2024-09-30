import java.util.Scanner;
public class pro7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the driving distance:");
            double drivingDistance = sc.nextDouble();
            System.out.println("Enter miles per gallon:");
            double milesPerGallon = sc.nextDouble();
            System.out.println("Enter price per gallon:");
            double pricePerGallon = sc.nextDouble();
            double cost = drivingDistance / milesPerGallon * pricePerGallon;
            System.out.print("The cost of driving is $");
            System.out.printf("%.2f", cost);
        }
    }



