import java.util.Scanner;

public class SqPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Square");
        int size = scanner.nextInt();

        for (int line = 1; line <= size; line++) {
            for (int star = 1; star <= size; star++) {
                if (line == 1 || line == size || star == 1 || star == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        scanner.close();
    }
}
