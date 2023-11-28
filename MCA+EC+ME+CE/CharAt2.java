import java.util.Scanner;

public class CharAt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        char name = scanner.nextLine().charAt(3);
        System.out.println("This is your name :" + name);

        scanner.nextLine();
        scanner.nextInt();
    }
}
