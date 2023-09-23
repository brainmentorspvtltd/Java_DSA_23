import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your roll no");
        int roll = scanner.nextInt();
        System.out.println("This is your roll no :" + roll);
        scanner.nextLine();
        System.out.println("Enter your name");
        // byte [] userInput = System.in.readAllBytes();
        // int userInput = System.in.read();
        // String userName = scanner.next();
        String userName = scanner.nextLine();

        // System.out.println("This is your name :" + (char)userInput);
        System.out.println("This is your name :" + userName);

        scanner.close();

    }
}
