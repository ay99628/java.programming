public class pro13 {
    public static void main(String[] args) {
        double pay = 50000; // Example current pay
        int score = 92; // Example score

        if (score > 90) {
            pay *= 1.03; // Increase pay by 3%
        } else {
            pay *= 1.01; // Increase pay by 1%
        }

        System.out.println("New pay: " + pay);
    }
}
