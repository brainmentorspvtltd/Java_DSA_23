public class PrintDigitRec {

    static void pritDigit(int n) {
        // base cond.
        if (n == 0) {
            return;
        }
        
        // small problem
        pritDigit(n - 1);

        // processing logic
        System.out.println(n);

    }

    public static void main(String[] args) {
        pritDigit(7);
    }
}
