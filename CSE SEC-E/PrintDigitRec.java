public class PrintDigitRec {

    void printDigit(int n){

        //base condition (stopping condition)
        if(n == 0){
            return;
        }


        //small problem
        printDigit(n-1);

         //this is processing logic
        System.out.println(n); 

    }
    public static void main(String[] args) {
        PrintDigitRec obj = new PrintDigitRec();
        obj.printDigit(10);
    }
}
