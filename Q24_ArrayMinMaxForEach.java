import java.util.Scanner;

public class Q24_ArrayMinMaxForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                values[i] = sc.nextInt();
            }

            int min = values[0];
            int max = values[0];
            for (int value : values) {
                if (value < min) min = value;
                if (value > max) max = value;
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
        sc.close();
    }
}
