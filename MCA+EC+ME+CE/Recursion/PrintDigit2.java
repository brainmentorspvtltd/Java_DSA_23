package Recursion;

public class PrintDigit2 {

    static void printDigit(int n) {
        if (n == 0) {
            return;
        }

        printDigit(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // for (int i = 5; i > 0; i--) {
        // System.out.println(i);
        // }
        printDigit(5);
    }
}
