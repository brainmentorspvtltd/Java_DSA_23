public class RopeCuttingProblem {

    static int maxPieces(int n, int a, int b,int c){

        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int l1 = maxPieces(n-a, a, b, c);
        int l2 = maxPieces(n-b, a, b, c);
        int l3 = maxPieces(n-c, a, b, c);

        int max = Math.max(Math.max(l1, l2), l3);

        if(max ==-1){
            return -1;
        }

        return max +1;

    }
    public static void main(String[] args) {
        System.out.println(maxPieces(7, 2, 3, 5));
    }
}
