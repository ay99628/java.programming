import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
        scanner.close();
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
