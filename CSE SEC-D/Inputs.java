import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your roll no");
        int roll = scanner.nextInt();
        System.out.println("This is the roll no :" + roll);
        scanner.nextLine();
        System.out.println("Enter your name");
        // byte[] input = System.i-n.readAllBytes();
        // int input = System.in.read();
        // String name = scanner.next();
        String name = scanner.nextLine();

        System.out.println("This is your name :" + name);

        
        // scanner.close();
    }
}
