import java.util.Random;
public class week11t13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // 填充矩阵
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // 计算每行 1 的个数
        int[] rowCounts = new int[4];
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            rowCounts[i] = count;
        }

        // 计算每列 1 的个数
        int[] colCounts = new int[4];
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            colCounts[j] = count;
        }

        // 找出最大行索引
        int maxRowCount = rowCounts[0];
        int maxRowIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (rowCounts[i] > maxRowCount) {
                maxRowCount = rowCounts[i];
                maxRowIndex = i;
            }
        }

        // 找出最大列索引
        int maxColCount = colCounts[0];
        int maxColIndex = 0;
        for (int j = 1; j < 4; j++) {
            if (colCounts[j] > maxColCount) {
                maxColCount = colCounts[j];
                maxColIndex = j;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}
