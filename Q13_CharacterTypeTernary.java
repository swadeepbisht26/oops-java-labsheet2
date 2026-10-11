import java.util.Scanner;

public class Q13_CharacterTypeTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String type = !Character.isLetterOrDigit(ch) ? "Special symbol"
                : Character.isDigit(ch) ? "Digit"
                : "Letter";

        type = type.equals("Letter")
                ? ("aeiouAEIOU".indexOf(ch) >= 0 ? "Vowel" : "Consonant")
                : type;

        System.out.println(type);
        sc.close();
    }
}
