import java.util.Scanner;

public class Armstrong {

    static int findLenght(int num) {

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    static int findPower(int base, int exp) {
        int powerValue = 1;
        for (int i = 1; i <= exp; i++) {
            powerValue *= base;
        }
        return powerValue;
    }

    static int isArmstrong(int num) {
        int numCopy = num;
        int numberLenght = findLenght(numCopy);
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += findPower(lastDigit, numberLenght);
            num /= 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int value = isArmstrong(number);

        if (number == value) {
            System.out.println("Arm");
        } else {
            System.out.println("Not Arm");
        }
        scanner.close();
    }
}
