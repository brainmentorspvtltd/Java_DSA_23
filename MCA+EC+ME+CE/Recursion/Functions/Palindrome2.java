package Functions;

import java.util.Random;
import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Random r = new Random();
        int cpu = r.nextInt(0, 100);
        System.out.println(cpu);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int count = 0;
        while (num != 0) {
            // number = number / 10;
            num /= 10;
            count++;
        }

        int numberOfDigits = (int) Math.log10(num) + 1;

        int divisor = (int) Math.pow(10, numberOfDigits - 1);

        for (int i = 0; i < numberOfDigits / 2; i++) {
            int leftDigit = num / divisor;
            int rightDigit = num % 10;

            if (leftDigit != rightDigit) {
                return false;
            }

            num = num % divisor / 10;
            divisor = divisor / 100;
        }

        return true; // If the loop completes, the number is a palindrome
    }
}
