import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder : " );
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
