import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int size = scanner.nextInt();

        for (int line = 1; line <= size; line++) {
            for (int star = 1; star <= size; star++) {
                if(line == 1 || line == size){
                System.out.print("*");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
