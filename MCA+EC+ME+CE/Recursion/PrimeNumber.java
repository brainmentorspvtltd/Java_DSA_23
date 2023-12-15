package Recursion;

public class PrimeNumber {

    static void isPrime(int num, int divisor) {
        if (divisor > num / 2) {
            System.out.println("The number is Prime");
            return;
        } else if (num % divisor == 0) {
            System.out.println("The number is not Prime");
            return;
        }
        isPrime(num, divisor + 1);
    }

    public static void main(String[] args) {
        isPrime(21, 2);
    }
}
