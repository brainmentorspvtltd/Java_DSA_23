package Functions;

import java.util.Scanner;

public class Triangle {

    static void checkTriangle(int side1, int side2, int side3) {

        if (side1 == side2 && side2 == side3) {
            System.out.println("Eq");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side");
        int side1 = scanner.nextInt();
        System.out.println("Enter the side2");
        int side2 = scanner.nextInt();
        System.out.println("Enter the side3");
        int side3 = scanner.nextInt();

        checkTriangle(side1, side2, side3);
    }
}