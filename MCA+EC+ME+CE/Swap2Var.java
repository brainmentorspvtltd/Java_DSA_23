import java.util.Scanner;

public class Swap2Var {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second Number");
        int num2 = scanner.nextInt();

        System.out.println("these are the variable before swap num1 is :" + num1 + "and num2 is :" + num2);

        // this is first solution using + and -
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;

        // this is the second solution using * and /
        // num1 = num1 * num2;
        // num2 = num1 / num2;
        // num1 = num1 / num2;

        // this is the third solution using bitwise XOR

        // num1 = 5
        // num = 7
        num1 = num1 ^ num2; // 5^7
        num2 = num1 ^ num2; //2^7 
        num1 = num1 ^ num2; // 2^5  

        System.out.println("these are the variable after swap num1 is :" + num1 + "and num2 is :" + num2);
    }
}