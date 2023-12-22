package Test;

import java.util.Scanner;

public class AutoMorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int numCopy = num;
        int length = 0;
        while (numCopy != 0) {
            numCopy = numCopy / 10;
            length++;
        }

        int numSquare = num * num;

        System.out.println("This is the square value :" + numSquare);
        int power = (int) Math.pow(10, length);

        int newNum = numSquare % power;

        if (newNum == num) {
            System.out.println("The num is Automorphic");
        } else {
            System.out.println("The num is not Automorphic");
        }
    }
}
