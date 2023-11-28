public class HollowSquare {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (j == 0 || i == 0 || j == 4 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
