package Functions;

import java.util.Scanner;

public class Palindrome {

    static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        int reveresedNumber = reverse(num);
        if (reveresedNumber == num) {
            System.out.println("The number is Palindrome");
        } else {
            System.out.println("The number is not Palindrome");
        }
        scanner.close();
    }
}
