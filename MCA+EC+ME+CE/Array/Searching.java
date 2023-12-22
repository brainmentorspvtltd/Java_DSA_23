package Array;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 55, 63, 12, 89, 455, 23, 6, 7, 8, 9 };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int n = scanner.nextInt();

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element found at index :" + i);
            }
            if (i == arr.length) {
                System.out.println("Element not found");
            }
        }
        scanner.close();
    }
}
