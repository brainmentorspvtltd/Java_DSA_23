import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws Exception {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter your name");
        // String name = abc.next(); // this only takes input until space character
        // (white space) is entered
        String name = abc.nextLine(); // nextLine()

        System.out.println("This is the name :" + name);

        // System.out.println("Enter the name");

        // // byte[] input = System.in.readAllBytes();
        // int input = System.in.read();

        // System.out.println("This is the output :" + input);
    }
}
