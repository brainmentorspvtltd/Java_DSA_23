import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        final int ADD = 1;
        final int SUB = 2;
        final int MUL = 3;
        final int DIV = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter 1 for Add");
        System.out.println("Enter 2 for Sub");
        System.out.println("Enter 3 for Mul");
        System.out.println("Enter 4 for Div");
        int choice = scanner.nextInt();

        switch (choice) {
            case ADD:
                System.out.println("This is the Sum of the two number :" + (num1 + num2));
                break;
            case SUB:
                System.out.println("This is the Sub of the two number :" + (num1 - num2));
                break;
            case MUL:
                System.out.println("This is the Mul of the two number :" + (num1 * num2));
                break;
            case DIV:
                System.out.println("This is the Div of the two number :" + (num1 / num2));
                break;
            default:
                System.out.println("Not a Vaild Input");
        }

    }
}
