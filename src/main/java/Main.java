public class Main {
    // Интервал 85 - 100
    static final int INTERVAL_STARTING_NUMBER = 85;
    static final int INTERVAL_UPPER_BOUND_EXCLUDED = 101;

    public static void main(String[] args) {
        for (int r : new Randoms(INTERVAL_STARTING_NUMBER, INTERVAL_UPPER_BOUND_EXCLUDED)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
