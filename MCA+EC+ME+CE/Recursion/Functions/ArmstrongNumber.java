package Functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int numC1 = num;
        int numC2 = num;

        int length = 0;
        while (num != 0) {
            num = num / 10;
            length++;
        }

        int sum = 0;
        while (numC1 != 0) {
            int power = 1;
            int lastDigit = numC1 % 10;
            for (int i = 1; i <= length; i++) {
                power = power * lastDigit;
            }
            sum = sum + power;
            numC1 = numC1 / 10;
        }

        if (numC2 == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}
