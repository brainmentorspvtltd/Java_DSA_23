import java.util.Scanner;

public class ArmStrong2 {

    static int findLength(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int findPower(int base, int exp) {
        int powerVal = 1;
        for (int i = 1; i <= exp; i++) {
            powerVal = powerVal * base;
        }
        return powerVal;
    }

    static int isArmstrong(int num) {
        int numLength = findLength(num);
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + findPower(lastDigit, numLength);
            num = num / 10;
        }
         return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int res = isArmstrong(number);

        if(res == number){
            System.out.println("The num is Armstrong");
        }
        else{
            System.out.println("The number is not Armstrong");
        }

    }
}
