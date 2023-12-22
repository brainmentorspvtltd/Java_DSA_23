package Recursion;

public class Temp3 {

    // static void value(int n) {
    // if (n == 5) {
    // return;
    // }
    // System.out.println("This is the value :" + n);
    // value(n + 1);
    // }

    static void value(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("This is the value :" + n);
        value(n - 1);
        System.out.println("This is the value :" + n);
    }

    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("This is the value :" + i);
        // }
        value(5);
    }
}
