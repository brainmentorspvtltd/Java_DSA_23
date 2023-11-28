import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the first num");
        String a = abc.nextLine();
        System.out.println("Enter the second num");
        String b = abc.nextLine();

        // int c = a + b;

        System.out.println("this is the output :" + a + b);
        abc.close();
    }
}
