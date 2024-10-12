import java.util.Scanner;
public class task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length from the center to a vertex
        System.out.print("Enter the length from the center of the pentagon to a vertex (r): ");
        double r = input.nextDouble();

        // Calculate the length of a side (s)
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Compute the area of the pentagon
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        // Round the area to two decimal places
        area = Math.round(area * 100.0) / 100.0;

        // Display the area
        System.out.println("The area of the pentagon is: " + area);
    }
}
