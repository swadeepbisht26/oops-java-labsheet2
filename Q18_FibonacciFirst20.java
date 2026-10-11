public class Q18_FibonacciFirst20 {
    public static void main(String[] args) {
        long first = 0;
        long second = 1;

        System.out.println("First 20 Fibonacci terms:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(first + (i < 20 ? " " : "\n"));
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
