public class PatternRecSq {

    static void printStar(int starCount) {
        if (starCount == 0) {
            return;
        }
        System.out.print("*");
        printStar(starCount - 1);
    }

    static void printPattern(int row, int col) {
        if (row == 0) {
            return;
        }
        printStar(col);
        System.out.println();
        printPattern(row - 1, col);
    }

    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        printPattern(5, 5);
    }
}
