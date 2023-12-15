package Functions;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
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

    // Function to check if a number is a palindrome using two pointers
    private static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; // Negative numbers are not palindromic
        }

        int numberOfDigits = (int) Math.log10(num) + 1; // Calculate the number of digits

        int divisor = (int) Math.pow(10, numberOfDigits - 1);

        for (int i = 0; i < numberOfDigits / 2; i++) {
            int leftDigit = num / divisor;
            int rightDigit = num % 10;

            if (leftDigit != rightDigit) {
                return false; // If digits at the two pointers are not equal, it's not a palindrome
            }

            // Update the number by removing the leftmost and rightmost digits
            num = num % divisor / 10;
            divisor = divisor / 100;
        }

        return true; // If the loop completes, the number is a palindrome
    }
}
