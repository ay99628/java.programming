public class task12 {
    public static void main(String[] args) {
        int count = 0;
        int lineCount = 0;
        System.out.println("The first 50 prime numbers are");
        for (int i = 2; count < 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                lineCount++;
                if (lineCount == 10) {
                    System.out.println();
                    lineCount = 0;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
