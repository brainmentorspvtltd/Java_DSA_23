package Recursion;

public class Temp4 {

    static void printStar(int starCount, int currentRow) {
        if (starCount == 0) {
            return;
        }
        System.out.print("*");
        printStar(starCount - 1);
    }

    static void printSqaurePattern(int row, int col) {
        if (row == 0) {
            return;
        }
        printStar(col);
        System.out.println();
        printSqaurePattern(row - 1, col);
    }

    public static void main(String[] args) {
        printSqaurePattern(5, 5);
    }
}
