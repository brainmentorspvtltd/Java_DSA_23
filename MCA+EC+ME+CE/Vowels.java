import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = scanner.next().charAt(0);

        if (ch == 'A' || ch == 'a' ||
                ch == 'E' || ch == 'e'
                || ch == 'I' || ch == 'i' ||
                ch == 'O' || ch == 'o' 
                || ch == 'U' || ch == 'u') {
            System.out.println("The char is A Vowel");
        } else {
            System.out.println("The Char is a consonant");
        }
    }
}
