import java.util.Scanner;
import java.awt.geom.Point2D;
public class task6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // 使用 Point2D.Double 创建点
        Point2D p1 = new Point2D.Double(x1, y1);
        Point2D p2 = new Point2D.Double(x2, y2);

        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));

        // 计算中点
        double midX = (x1 + x2) / 2;
        double midY = (y1 + y2) / 2;
        Point2D midPoint = new Point2D.Double(midX, midY);

        System.out.println("The midpoint between p1 and p2 is " + midPoint.toString());
    }
}