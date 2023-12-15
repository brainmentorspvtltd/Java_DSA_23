package Recursion;

public class SolidSquare {

    static void printStar(int starCount) {
        if (starCount == 0) {
            return;
        }
        System.out.print("* ");
        printStar(starCount - 1);
    }

    static void printPattern(int col, int row) {
        if (row == 0) {
            return;
        }
        printStar(col);
        System.out.println();
        printPattern(col, row - 1);
    }

    public static void main(String[] args) {
        printPattern(5, 5);
    }
}
