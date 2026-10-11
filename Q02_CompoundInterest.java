import java.util.Scanner;

public class Q02_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, annual rate (%), and time (years): ");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100.0, time);
        double compoundInterest = amount - principal;

        System.out.printf("Final amount: %.2f%n", amount);
        System.out.printf("Compound interest: %.2f%n", compoundInterest);
        sc.close();
    }
}
