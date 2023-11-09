import java.util.Scanner;

public class SolidSq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");

        int size = in.nextInt();

        for (int line = 1; line <= size; line++) {
            for (int star = 1; star <= size; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
