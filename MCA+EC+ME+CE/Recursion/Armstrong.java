package Recursion;

public class Armstrong {

    static int len = 0;
    static int power = 1;
    static int sum = 0;

    static int findLenght(int num) {
        if (num == 0) {
            return 0;
        }
        len++;
        findLenght(num / 10);
        return len;
    }

    static int findPower(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        power = power * base;
        findPower(base, exp - 1);
        return power;
    }

    static int isArmstrong(int number, int lenght) {
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10;
        sum = sum + findPower(lastDigit, lenght);
        power = 1;
        isArmstrong(number / 10, lenght);
        return sum;

    }

    public static void main(String[] args) {
        int num = 153;
        int res = isArmstrong(num, findLenght(num));

        if (res == num) {
            System.out.println("The number is Armstrong" + res);
        } else {
            System.out.println("The number is not Armstrong " + res);
        }

    }
}
