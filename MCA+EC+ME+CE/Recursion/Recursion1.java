package Recursion;

public class Recursion1 {

    static void printHello(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("HELLO");
        printHello(n - 1);
    }

    public static void main(String[] args) {
        printHello(5);
    }
}
