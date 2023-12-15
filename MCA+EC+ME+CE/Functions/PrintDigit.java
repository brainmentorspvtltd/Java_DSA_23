package Functions;

import java.util.Scanner;

public class PrintDigit {

    static int calcLength(int num) {
        int length = 0;
        while (num != 0) {
            num = num / 10;
            length++;
        }
        return length;
    }

    static int findPower(int base, int exp) {
        int power = 1;
        for (int i = 1; i <= exp; i++) {
            power = power * base;
        }
        return power;
    }

    static void printDigit(int num) {
        int numLen = calcLength(num);
        int temp = findPower(10, numLen - 1);
        while (num != 0) {
            int singleDigit = num / temp;
            System.out.println(singleDigit);
            num = num % temp;
            temp = temp / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scanner.nextInt();
        printDigit(num1);
    }
}
