package Functions;

import java.util.Scanner;

public class Calc {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter + for add ");
        System.out.println("Enter - for sub ");
        System.out.println("Enter * for mul ");
        System.out.println("Enter / for div ");
        char choice = scanner.next().charAt(0);

        if (choice == '+') {
            int res = add(num1, num2);
            System.out.println(res);
        } else if (choice == '-') {
           int res = sub(num1, num2);
            System.out.println(res);

        } else if (choice == '*') {
           int res = mul(num1, num2);
            System.out.println(res);

        } else if (choice == '/') {
           int res = div(num1, num2);
            System.out.println(res);

        } else {
            System.out.println("Not a valid choice");
        }

    }
}
