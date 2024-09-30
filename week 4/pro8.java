import  java.util.Scanner;
public class pro8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the side:");
            double length = sc.nextDouble();
            double area = 3 * Math.sqrt(3) / 2 * length * length;
            System.out.print("The area of the hexagon is ");
            System.out.printf("%.4f", area);
        }

}
