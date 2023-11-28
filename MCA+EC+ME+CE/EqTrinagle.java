public class EqTrinagle {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // for (int space = 0; space < 5 - i; space++) {
        // System.out.print(" ");
        // }
        // for (int star = 0; star < (i * 2) - 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= (5 - i) && j <= (3 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
