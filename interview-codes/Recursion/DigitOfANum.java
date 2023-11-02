public class DigitOfANum {

    static void func(int n){
        if(n==0){
            return;
        }
        func(n/10);
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        int n=3456;
        func(n);
    }
}
