package Recursion;

import java.util.Scanner;

public class SumOfDigit {

    static int sum = 0;

    static int printSum(int num) {
        if (num == 0) {
            return sum;
        }
        int lastDigit = num % 10;
        sum = sum + lastDigit;
        printSum(num / 10);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int sum = printSum(number);
        System.out.println(sum);
    }
}
