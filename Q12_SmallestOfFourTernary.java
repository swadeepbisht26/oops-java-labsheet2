import java.util.Scanner;

public class Q12_SmallestOfFourTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int smallestAB = (a < b) ? a : b;
        int smallestCD = (c < d) ? c : d;
        int smallest = (smallestAB < smallestCD) ? smallestAB : smallestCD;

        System.out.println("Smallest number: " + smallest);
        sc.close();
    }
}
