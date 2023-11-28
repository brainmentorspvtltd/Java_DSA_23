import java.util.Scanner;

public class InputsIn {
    public static void main(String[] args) throws Exception {

        Scanner saurabh = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = saurabh.nextLine();
        System.out.println("Enter your last name");

        String lastName = saurabh.nextLine();

        System.out.println("this is the first name :" + firstName);
        System.out.println("this is the last name :" + lastName);

        // System.out.println("Enter your name");
        // int name = System.in.read();
        // char ch = (char)name;
        // System.out.println("This is your name :" + name);
        // System.out.println("This is the char value :" + ch);

    }
}
