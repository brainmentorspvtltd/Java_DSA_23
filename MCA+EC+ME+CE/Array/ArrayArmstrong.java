package Array;

public class ArrayArmstrong {

    static int calcLength(int num) {
        int length = 0;
        while (num != 0) {
            num = num / 10;
            length++;
        }
        return length;
    }

    static int findPower(int base, int exp) {
        int power = 1;
        for (int i = 1; i <= exp; i++) {
            power = power * base;
        }
        return power;
    }

    static int isArmstrong(int num) {
        int numLen = calcLength(num);
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + findPower(lastDigit, numLen);
            num = num / 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        int arr[] = { 1634, 407, 371, 153, 123, 586 };

        for (int data : arr) {
            int res = isArmstrong(data);
            if (res == data) {
                System.out.println("The number is Armstrong");
            } else {
                System.out.println("The number is not Armstrong");
            }
        }
    }
}
