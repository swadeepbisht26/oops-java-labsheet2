import java.util.Scanner;

public class Q09_LexicographicStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = sc.nextLine();
        System.out.print("Enter the second string: ");
        String second = sc.nextLine();

        int i = 0;
        int result = 0;
        int commonLength = Math.min(first.length(), second.length());

        while (i < commonLength) {
            char a = first.charAt(i);
            char b = second.charAt(i);

            if (a < b) {
                result = -1;
                break;
            } else if (a > b) {
                result = 1;
                break;
            }
            i++;
        }

        if (result == 0) {
            if (first.length() < second.length()) {
                result = -1;
            } else if (first.length() > second.length()) {
                result = 1;
            }
        }

        if (result < 0) {
            System.out.println("\"" + first + "\" comes before \"" + second + "\".");
        } else if (result > 0) {
            System.out.println("\"" + first + "\" comes after \"" + second + "\".");
        } else {
            System.out.println("Both strings are equal.");
        }
        sc.close();
    }
}
