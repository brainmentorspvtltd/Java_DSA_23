public class PrintNumber2 {

    static void printDigit(int n) {
        if (n == 0) {
            return; // fn stop
        }
        printDigit(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printDigit(10);
    }
}
