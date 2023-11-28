import java.util.Scanner;

public class SimpleInterst {

    // void with Parameter
    static void findSI(int p, int r, int t) {
         
        int SI = (p * r * t) / 100;
        System.out.println("This is the Simple Interst :" + SI);
    }

    static int findSI2(int p, int r, int t) {
        // int SI = (p * r * t) / 100;
        // return SI;
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        int principal = scanner.nextInt();
        System.out.println("Enter the Rate of Interst");
        int rate = scanner.nextInt();
        System.out.println("Enter the Time Duration");
        int time = scanner.nextInt();

        findSI(principal, rate, time);
        int result = findSI2(principal, rate, time);
        System.out.println("This is the result :" + result);
        scanner.close();
    }
}
