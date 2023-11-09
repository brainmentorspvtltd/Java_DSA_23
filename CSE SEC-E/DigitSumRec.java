public class DigitSumRec {

    static int digitSum(int num) {
        if (num == 0) {
            return 0;
        }
        int lastDigit = num % 10;

        return lastDigit + digitSum(num / 10);
    }

    public static void main(String[] args) {
        int num = 12345;

        int sum = digitSum(num);
        // while (num != 0) {
        // int lastDigit = num % 10;
        // sum = sum + lastDigit;
        // num = num / 10;
        // }
        System.out.println("This is the sum :" + sum);
    }
}