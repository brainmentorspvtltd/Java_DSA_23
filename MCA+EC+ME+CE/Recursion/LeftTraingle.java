package Recursion;

import java.util.Scanner;

public class LeftTraingle {

    static void printStar(int starCount) {
        if (starCount == 0) {
            return;
        }
        System.out.print("* ");
        printStar(starCount - 1);
    }

    static void printPattern(int col, int row) {
        if (col == 0) {
            return;
        }
        printStar(row);
        System.out.println();
        printPattern(col - 1, row + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the pattern");
        int size = scanner.nextInt();
        printPattern(size, 1);
    }
}
