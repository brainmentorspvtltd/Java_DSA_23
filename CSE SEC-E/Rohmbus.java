import java.util.Scanner;

public class Rohmbus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Rohmbus");
        int size = scanner.nextInt();

        for(int line = 1; line<= size; line ++){
            for(int space =1 ; space< line ; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<= size; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
