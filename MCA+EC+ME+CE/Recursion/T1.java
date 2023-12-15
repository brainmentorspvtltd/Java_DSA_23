package Recursion;

public class T1 {

    static void printName(int count) {
        // base case
        if (count == 0) {
            return;
        }
        // logic
        System.out.println("Hello Java");

        //small problem
        printName(count - 1);

        System.out.println("Hello Python");
    }

    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        //     System.out.println("Hello java");
        // }
        printName(6);
    }
}
