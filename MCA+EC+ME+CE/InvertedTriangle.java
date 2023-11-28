public class InvertedTriangle {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i < 5; i++) {
            for (j = 1; j < 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
