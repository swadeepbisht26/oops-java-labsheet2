import java.util.Scanner;

public class Q23_PalindromeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not treated as palindromes here.");
        } else {
            int original = number;
            int temp = number;
            int reversed = 0;

            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
        sc.close();
    }
}
