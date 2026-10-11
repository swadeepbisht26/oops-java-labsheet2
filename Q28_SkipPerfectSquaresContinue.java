public class Q28_SkipPerfectSquaresContinue {
    public static void main(String[] args) {
        for (int number = 1; number <= 50; number++) {
            int root = (int) Math.sqrt(number);
            if (root * root == number) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
