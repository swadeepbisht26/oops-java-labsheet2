import java.util.Scanner;

public class Q10_LeapYearInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year, range start, and range end: ");
        int year = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (leap && year >= start && year <= end) {
            System.out.println(year + " is a leap year within the given range.");
        } else {
            System.out.println(year + " is not both a leap year and within the range.");
        }
        sc.close();
    }
}
