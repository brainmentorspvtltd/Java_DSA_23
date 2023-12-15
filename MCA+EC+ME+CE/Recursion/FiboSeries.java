package Recursion;

public class FiboSeries {

    static int n1 = 0;
    static int n2 = 1;
    // static int n3 = 0;s

    static void printFiboSeries(int count) {
        if (count == 0) {
            return;
        }
        if (n1 == 0 || n2 == 1) {
            System.out.print(n1);
            // System.out.print(n2);

        }
        int n3 = n1 + n2;
        if (n3 != 1) {
            System.out.print(n3);

        }
        n1 = n2;
        n2 = n3;
        printFiboSeries(count - 1);

    }

    public static void main(String[] args) {
        printFiboSeries(10);
    }
}
