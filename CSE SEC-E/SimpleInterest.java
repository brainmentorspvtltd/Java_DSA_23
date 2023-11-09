import java.util.Scanner;

public class SimpleInterest {

    static int calcSimpleInterest(int abcd, int rate, int time) {
        int simpleInt = (abcd * rate * time) / 100;
        return simpleInt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principle");
        int p = scanner.nextInt();
        System.out.println("Enter the Rate");
        int r = scanner.nextInt();
        System.out.println("Enter the Time duration");
        int t = scanner.nextInt();

        int res = calcSimpleInterest(p, r, t);

        System.out.println("This is the SI :" + res);
    }
}
