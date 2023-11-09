public class PatternRec {

    static void printRow(int starCount) {
        if (starCount == 0) {
            return;
        }
        System.out.print("*");
        printRow(starCount - 1);
    }

    static void printPattern(int col, int row) {
        if (row == 0) {
            return;
        }
        printRow(col);
        System.out.println();
        printPattern(col, row - 1);
    }

    public static void main(String[] args) {
        printPattern(10, 2);
    }
}