import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        System.out.println("This is the sum of the number " + sum);
        scanner.close();
    }
}
