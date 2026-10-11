import java.util.Scanner;

public class Q17_RotateBitsLeftByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = sc.nextInt();

        int rotated = (value << 2) | (value >>> 30);
        System.out.println("Original (32-bit): " + String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0'));
        System.out.println("Rotated left by 2 (32-bit): " + String.format("%32s", Integer.toBinaryString(rotated)).replace(' ', '0'));
        System.out.println("Rotated integer value: " + rotated);
        sc.close();
    }
}
