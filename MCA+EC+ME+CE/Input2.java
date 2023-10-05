import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your rollno");
        int rollno = scanner.nextInt();
        System.out.println("This is your roll no :" + rollno);
        scanner.nextLine();
        System.out.println("enter your name");
        // byte[] input = System.in.readAllBytes();
        // int input = System.in.read();
        String input = scanner.nextLine();
        System.out.println("This is your name :" + input);
        
    }
}