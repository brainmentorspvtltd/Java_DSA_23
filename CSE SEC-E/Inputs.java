import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws Exception {
        Scanner abc = new Scanner(System.in);
         System.out.println("Enter your roll no");
        int roll = abc.nextInt();
        System.out.println("This is the roll no :" + roll); 
        abc.nextLine();
        System.out.println("Enter your name");
        // String name = abc.next();
        String name = abc.nextLine();
        // byte[] input = System.in.readAllBytes();
        // int input = System.in.read();
        System.out.println("This is your name :" + name);
       
        // String name =
        abc.close();
    }
}
