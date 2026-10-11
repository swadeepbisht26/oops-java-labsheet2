import java.util.Scanner;

public class Q22_ReverseDigitsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        long value = Math.abs((long) number);
        long reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
