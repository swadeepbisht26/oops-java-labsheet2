import java.util.Scanner;

public class Q07_WeeklyRainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for day " + day + ": ");
            double rainfall = sc.nextDouble();
            total += rainfall;
        }

        System.out.printf("Total rainfall for 7 days: %.2f%n", total);
        sc.close();
    }
}
