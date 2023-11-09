import java.util.Scanner;

public class HollowSq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");

        int size = in.nextInt();

        for (int line = 1; line <= size; line++) {
            // this loop is printing stars
            for (int star = 1; star <= size; star++) {
                if (line == 1 || line == size || star ==1 || star == size) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
