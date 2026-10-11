import java.util.Scanner;

public class Q06_HalveUntilBelowOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double number = sc.nextDouble();
        int steps = 0;

        if (number <= 0) {
            System.out.println("Please enter a number greater than zero.");
        } else {
            while (number >= 1) {
                number /= 2.0;
                steps++;
            }
            System.out.println("Steps required: " + steps);
            System.out.println("Final value: " + number);
        }
        sc.close();
    }
}
