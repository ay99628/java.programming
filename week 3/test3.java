import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = PI * radius * radius;
        System.out.println("The area of the circle of radius" +radius + " is " + area);
    }
}
