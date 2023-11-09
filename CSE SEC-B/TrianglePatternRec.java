public class TrianglePatternRec {

    static void printStar(int star) {
        if (star == 0) {
            return;
        }
        printStar(star - 1);
        System.out.print("*");

    }

    static int printPattern(int row) {
        if (row == 0) {
            return 1;
        }
        int col = row;
        printPattern(row - 1);
        System.out.println();
        printStar(col);
        return 1;
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
