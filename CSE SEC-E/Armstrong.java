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
        int numberCopy = num;
        int numLenght = findLenght(numberCopy);
        int sum = 0;
        while (num != 0) { // 1234
            int lastDigit = num % 10; // 4
            sum += findPower(lastDigit, numLenght);// 4^4
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int finalRes = isArmstrong(number);

        if (finalRes == number) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        scanner.close();

    }
}
