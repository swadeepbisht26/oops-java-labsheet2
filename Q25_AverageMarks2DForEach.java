import java.util.Scanner;

public class Q25_AverageMarks2DForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students and subjects: ");
        int students = sc.nextInt();
        int subjects = sc.nextInt();

        if (students <= 0 || subjects <= 0) {
            System.out.println("Both values must be positive.");
        } else {
            double[][] marks = new double[students][subjects];
            for (int i = 0; i < students; i++) {
                for (int j = 0; j < subjects; j++) {
                    System.out.print("Student " + (i + 1) + ", subject " + (j + 1) + ": ");
                    marks[i][j] = sc.nextDouble();
                }
            }

            double total = 0;
            int count = 0;
            for (double[] studentMarks : marks) {
                for (double mark : studentMarks) {
                    total += mark;
                    count++;
                }
            }

            System.out.printf("Average marks across all students and subjects: %.2f%n",
                    total / count);
        }
        sc.close();
    }
}
