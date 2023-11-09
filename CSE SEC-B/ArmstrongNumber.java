import java.util.Scanner;

public class ArmstrongNumber {

    static int findLenght(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;

    }

    static int findPower(int base, int exp) {
        int powerValue = 1;
        for (int i = 1; i <= exp; i++) {
            powerValue = powerValue * base;
        }
        return powerValue;
    }

    static int isArmstrong(int num) {
        int copyNum = num; // 1234

        int numLen = findLenght(num);
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10; // 4
            sum = sum + findPower(lastDigit, numLen);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber = scanner.nextInt();

        // int charAscc = System.in.read();
        // char ch = (char)charAscc;

        char ch = scanner.next().charAt(0);
        int result = isArmstrong(inputNumber);

        if (inputNumber == result) {
            System.out.println("This is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}
