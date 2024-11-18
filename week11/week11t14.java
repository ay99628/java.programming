import java.util.Random;
public class week11t14 {
    public static void shuffle(int[][] m) {
        Random random = new Random();
        for (int i = m.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("原始矩阵:");
        for (int[] row : m) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        shuffle(m);

        System.out.println("洗牌后的矩阵:");
        for (int[] row : m) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    }
