import java.util.Scanner;
public class week11t8 {
    public static void main(String[] args) {
        int[][] m = getArray();
        System.out.println("Sum of all elements is " + sum(m));
    }
    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][4];
        for(int row = 0;row < m.length;row++){
            for(int column = 0;column < m[row].length;column++){
                m[row][column] = input.nextInt();
            }
        }
        return m;
    }
    public static int sum(int[][] m){
        int total = 0;
        for(int row = 0;row < m.length;row++){
            for(int column = 0;column < m[row].length;column++){
                total+=m[row][column];
            }
        }
        return total;
    }
}
