import java.util.Scanner;
public class pro17 {

    public static void main(String[] args) {
        int standard = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits):");
        int pick = sc.nextInt();
        int first = pick / 10, second = pick % 10;
        System.out.println("The lottery number is : " + standard);
        if (first == standard / 10 && second == standard % 10) {
            System.out.println("Exact match: you win $10,000");
        } else if (second == standard / 10 && first == standard % 10) {
            System.out.println("Match all digits: you win $3,000");
        } else if (first == standard / 10 || second == standard / 10
                || first == standard % 10 || second == standard % 10) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry: no match");
        }
    }
}


