import java.util.Scanner;
public class task22 {
    public static double min(double[] array) {
        if (array == null || array.length == 0) {
            return Double.MAX_VALUE;
        }
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        double[] doubleArray = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = scanner.nextDouble();
        }
        double minNumber = min(doubleArray);
        System.out.println("The minimum number is " + minNumber);
    }
}
