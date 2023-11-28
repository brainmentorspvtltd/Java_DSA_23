import java.util.Scanner;

public class DiscountChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Bill Amount");
        int billValue = scanner.nextInt();
        int discountValue = 0;
        if (billValue >= 1000 || billValue <= 5000) {
            discountValue = 5;
        } else if (billValue > 5000 || billValue <= 10000) {
            discountValue = 10;

        } else if (billValue > 10000 || billValue <= 20000) {
            discountValue = 15;

        } else {
            discountValue = 25;
        }
    }
}
