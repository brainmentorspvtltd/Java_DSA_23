public class Josephus {

    static int jos(int n ,int k){
        if(n==1){
            return 0;
        }
        System.out.println((jos(n-1, k)+k)%n);
        return (jos(n-1, k)+k)%n;

    }
    public static void main(String[] args) {
        System.out.println(jos(7, 3));
    }
}
