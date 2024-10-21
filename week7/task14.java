import java.util.Scanner;
public class task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// 输入两个整数
        System.out.print("Enter first integer: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNum = input.nextInt();

        int gcd = findGCD(firstNum, secondNum);
        System.out.println("The greatest common divisor for " + firstNum + " and " + secondNum + " is " + gcd);
    }

    // 计算最大公约数
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // 余数赋值给 b
            a = temp; // 将 a 更新为 b 的值
        }
        return a; // 当 b 为 0 时，a 即为最大公约数
    }
}
