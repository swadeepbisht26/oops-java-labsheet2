import java.util.Scanner;

public class Q11_StudentCoursePass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory, practical, and overall percentages: ");
        double theory = sc.nextDouble();
        double practical = sc.nextDouble();
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50) {
            System.out.println("Student passes the course.");
        } else {
            System.out.println("Student fails the course.");
        }
        sc.close();
    }
}
