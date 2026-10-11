import java.util.Scanner;

public class Q16_ShiftMultiplyDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer and a shift count (0-30): ");
        int number = sc.nextInt();
        int shift = sc.nextInt();

        if (shift < 0 || shift > 30) {
            System.out.println("Shift count must be between 0 and 30.");
        } else {
            System.out.println("Multiply by 2^" + shift + " using << : " + (number << shift));
            System.out.println("Divide by 2^" + shift + " using >> : " + (number >> shift));
        }
        sc.close();
    }
}
