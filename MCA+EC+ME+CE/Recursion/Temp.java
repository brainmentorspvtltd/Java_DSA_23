package Recursion;

import java.util.Scanner;

public class Temp {

    static void printDigitRtL(int num) {
        if (num == 0) {
            return;
        }
        int lastDigit = num % 10;

        System.out.println(lastDigit);

        printDigitRtL(num / 10);
        // System.out.println(lastDigit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        // while (num != 0) {
        // int lastDigit = num % 10;
        // System.out.println(lastDigit);
        // num = num / 10;
        // }
        printDigitRtL(num);
    }
}
