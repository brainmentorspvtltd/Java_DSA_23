public class HollowTriangle {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (i == 0 || j == 4 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
