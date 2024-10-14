public class task14 {
    public static void main(String[] args) {
        double tuition = 10000.0;
        double doubleTuition = tuition * 2;
        double increaseRate = 0.07;
        int years = 0;

        while (tuition < doubleTuition) {
            tuition *= (1 + increaseRate);
            years++;
        }
        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.println("Tuition will be $" + tuition + " in " + years + " years");
    }
}
