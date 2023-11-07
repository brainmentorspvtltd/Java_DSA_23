public class PatternRec {

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
        // obj name is out
        // println() is the member name
        System.out.println();
        printPattern(row - 1, col);
    }

    public static void main(String[] args) {
        printPattern(5, 5);
    }
}
