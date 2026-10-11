import java.util.Scanner;

public class Q04_PrefixPostfixVisitors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visitors = 0;

        System.out.print("How many visitors are entering? ");
        int entering = sc.nextInt();
        for (int i = 0; i < entering; i++) {
            System.out.println("Visitor enters; count after prefix ++: " + (++visitors));
        }

        System.out.print("How many visitors are leaving? ");
        int leaving = sc.nextInt();
        for (int i = 0; i < leaving; i++) {
            int previous = visitors--;
            System.out.println("Visitor leaves; postfix value was " + previous
                    + ", count now: " + visitors);
        }

        System.out.println("Final visitor count: " + visitors);
        sc.close();
    }
}
