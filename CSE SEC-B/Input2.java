import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your roll no");
        int roll = scanner.nextInt();
        System.out.println("This is the roll no :" + roll); 
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("This is the name of the user :" + name);

        scanner.close();

    }
}
