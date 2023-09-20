import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your id");
        int id = scanner.nextInt();
        System.out.println("this is the id :" + id);
        scanner.nextLine();
        System.out.print("enter your name");
        String name = scanner.nextLine();
        System.out.println("this is the name :" + name);

        scanner.close();
        // byte[] inputArray = System.in.readAllBytes();
        // int inputData= System.in.read();
        // System.out.println("This is your name: "+ inputData );
    }
}
