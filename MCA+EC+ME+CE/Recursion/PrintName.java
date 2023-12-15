package Recursion;

import java.util.Scanner;

public class PrintName {

    static void printName(String userName, int count) {
        if (count == 0) {
            return;
        }
        System.out.println(userName);
        printName(userName, count - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Enter the count :");
        int count = scanner.nextInt();

        printName(name, count);
    }
}
