public class PrintNSumRec {

    static int printSum(int num){
        if(num == 0){
            return 0;
        }
        return num + printSum(num -1);
    }
    public static void main(String[] args) {
        int res = printSum(5);
        System.out.println("This is the sum :" + res);
    }
}
