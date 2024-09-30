import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remainingSeconds = " + remainingSeconds);
    }
}
