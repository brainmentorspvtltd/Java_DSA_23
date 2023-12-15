package Recursion;

public class Factorial {

    static int printFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * printFactorial(num - 1);
    }

    public static void main(String[] args) {
        int res = printFactorial(5);

        System.out.println("This is the fact :" + res);
    }
}
