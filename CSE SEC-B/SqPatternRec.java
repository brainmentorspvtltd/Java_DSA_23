public class SqPatternRec {

    static void printStarRow(int starCount) {
        if (starCount == 0) {
            return;
        }
        System.out.print("*");
        printStarRow(starCount - 1);
    }

    static void printPattern(int row, int col) {
        if (row == 0) {
            return;
        }
        printStarRow(col);
        System.out.println();
        printPattern(row - 1, col);
    }

    public static void main(String[] args) {

        printPattern(10, 3);


        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 8; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}
