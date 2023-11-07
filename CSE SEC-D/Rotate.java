import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        System.out.println("Please enter the number of rotations");
        int rotations = scanner.nextInt();
        int countDigit = 0;
        int numCopy = num;
        while (numCopy != 0) {
            numCopy /= 10;
            countDigit++;
        }
        rotations = rotations % countDigit;
        if (rotations < 0) {
            rotations = rotations + countDigit;
        }
        int power = (int) Math.pow(10, rotations);
        int leftPart = num / power;
        int rightPart = num % power;
        int remainingPower = countDigit - rotations;
        power = (int) Math.pow(10, remainingPower);
  
        int res = rightPart * power + leftPart;

        System.out.println("This is the result :" + res);
        scanner.close();

    }
}
