import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// 提示用户输入三个点的坐标
        System.out.print("Enter three points (x1 y1 x2 y2 x3 y3): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

// 计算三边的长度
        double a = distance(x2, y2, x3, y3); // 边BC
        double b = distance(x1, y1, x3, y3); // 边AC
        double c = distance(x1, y1, x2, y2); // 边AB

// 计算角度
        double angleA = calculateAngle(b, c, a);
        double angleB = calculateAngle(a, c, b);
        double angleC = 180 - angleA - angleB;

// 显示结果
        System.out.printf("The three angles are: %.2f, %.2f, %.2f\n", angleA, angleB, angleC);
    }

    // 计算两点之间的距离
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // 根据余弦定理计算角度
    public static double calculateAngle(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
    }
}


