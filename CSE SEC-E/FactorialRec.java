public class FactorialRec {
    static int findFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFactorial(num - 1);
    }

    public static void main(String[] args) {
        int fact = findFactorial(5);
        System.out.println("This is the factorial :" + fact);
    }
}
