public class task9 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j<=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
