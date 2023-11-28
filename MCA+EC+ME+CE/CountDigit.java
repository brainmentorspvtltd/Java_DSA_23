import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int count = 0;

        while (number != 0) {
            // number = number / 10;
            number /= 10;
            count++;
        }
        System.out.println("This is the count of the number " + count);
        scanner.close();
    }
}
