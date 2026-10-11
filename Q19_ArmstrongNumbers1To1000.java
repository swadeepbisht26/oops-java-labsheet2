public class Q19_ArmstrongNumbers1To1000 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int number = 1; number <= 1000; number++) {
            int temp = number;
            int digits = String.valueOf(number).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
