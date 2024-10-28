import java.util.Scanner;
public class task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
