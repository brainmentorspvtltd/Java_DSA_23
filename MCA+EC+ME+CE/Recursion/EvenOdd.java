package Recursion;

public class EvenOdd {

    static void printEvenOdd(int count) {
        if (count == 0) {
            return;
        }
        if (count % 2 == 0) {
            System.out.println(count + " is Even");
        } else {
            System.out.println(count + " is Odd");
        }
        printEvenOdd(count - 1);
    }

    public static void main(String[] args) {
        printEvenOdd(5);
    }
}