import java.util.Scanner;

public class PrintDigit {

    static void printDigits(int num) {
        // base case
        if (num == 0) {
            return;
        }
        // logic
        int lastDigit = num % 10;
        System.out.println(lastDigit);

        printDigits(num / 10);

        System.out.println(lastDigit);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        printDigits(num);

    }
}
