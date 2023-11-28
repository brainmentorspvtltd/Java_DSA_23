public class Rohmbus {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            for (int space = 0; space <= j; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 5; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
