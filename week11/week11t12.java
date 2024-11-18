import java.util.Scanner;
public class week11t12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3 - by - 4 matrix row - by - row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int column = 0; column < 4; column++) {
            double sum = sumColumn(matrix, column);
            System.out.println("Sum of the elements at column " + column + " is " + sum);
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        // 遍历矩阵的行
        for (int i = 0; i < m.length; i++) {
            // 将每行中指定列的元素累加到sum中
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
