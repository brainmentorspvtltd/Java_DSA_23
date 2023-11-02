public class Print1to10{

    static void print1to10(int n){
        //base case
        if(n==0){
            return;
        }
        print1to10(n-1);
        if(n%2==0){
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        print1to10(10);
    }
}