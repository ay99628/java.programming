import java.util.Scanner;
public class pro18 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int year= input.nextInt();
        boolean isleapYear=(year %4==0);
        isleapYear=isleapYear &&(year %100!=0);
        isleapYear=isleapYear||(year %400==0);
        isleapYear=(year %4==0&& year %100!=0)||(year %400==0);

    }
}
