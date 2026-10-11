import java.util.Random;

public class Q29_RandomUntilDivisibleBy7And13 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int attempts = 0;

        while (true) {
            number = random.nextInt(100) + 1;
            attempts++;
            System.out.println("Generated: " + number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found " + number + " after " + attempts + " attempts.");
                break;
            }
        }
    }
}
