package Test;

import java.util.Scanner;

public class PetesonNumber {

    static int findFact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFact(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int numCopy = num;
        int sum = 0;
        while (numCopy != 0) {
            int lastDigit = numCopy % 10;
            sum = sum + findFact(lastDigit);
            numCopy = numCopy / 10;
        }

        if (sum == num) {
            System.out.println("The num is Peterson");
        } else {
            System.out.println("The num is not Peterson");
        }

    }
}
