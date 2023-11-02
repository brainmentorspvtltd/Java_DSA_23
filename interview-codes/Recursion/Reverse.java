public class Reverse {

    static int rev=0;
    static int revNum(int n){
        if(n<=0){
            return rev;
        }
        int rem = n%10;
        rev = rev *10 + rem;
        return revNum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(revNum(3456));
    }
}
