public class ArmstrongRec {

    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static int isArmstrong(int num, int numDigits) {
        if (num == 0) {
            return 0;
        }

        int lastDigit = num % 10;
        return power(lastDigit, numDigits) + isArmstrong(num / 10, numDigits);
    }

    public static void main(String[] args) {
        int num = 153;
        int numLength = countDigits(num);
        int result = isArmstrong(num, numLength);
        if (result == num) {
            System.out.println("Arm");
        } else {
            System.out.println("Not Arm");
        }
    }

}
