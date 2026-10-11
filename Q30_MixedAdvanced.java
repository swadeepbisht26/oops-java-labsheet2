import java.util.Scanner;

public class Q30_MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        boolean powerOfFour = number > 0
                && (number & (number - 1)) == 0
                && (number & 0x55555555) != 0;

        // A power of four has exactly one set bit, in an even-numbered bit position.
        System.out.println(number + (powerOfFour ? " is a power of 4." : " is not a power of 4."));

        int toggled = number ^ (1 << 2); // Toggle bit position 3 (counting from 1).
        System.out.println("After toggling the 3rd bit: " + toggled);

        System.out.println("Multiplication table (skipping multiples of 6; stop at a multiple of 48):");
        for (int i = 1; i <= 100; i++) {
            int product = number * i;

            if (product % 48 == 0) {
                System.out.println("Reached multiple of 48: " + product + ". Stopping.");
                break;
            }
            if (product % 6 == 0) {
                continue;
            }
            System.out.println(number + " x " + i + " = " + product);
        }
        sc.close();
    }
}
