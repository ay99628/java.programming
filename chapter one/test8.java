public class test8 {
    public static void main(String[] args) {
        double number_now = 312032486.0;
        double days = 365.0;
        double seconds = days * 24.0 * 60 * 60;
        double birth = seconds/7.0;
        double death = seconds/13.0;
        double immigrant = seconds/45.0;
        int number_new = (int) (number_now + (birth + immigrant - death) * 5);
        System.out.println(number_new);
    }
}
