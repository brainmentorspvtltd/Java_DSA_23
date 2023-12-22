package Functions;

public class Add {

    // no return type (void) and have no parameter
    static void add() {
        int a = 5;
        int b = 50;
        int c = a + b;
        System.out.println("this is the result :" + c);
    }

    // no return type (void) and have parameter
    // static void add(int a, int b) {
    // int c = a + b;
    // System.out.println("this is the result :" + c);
    // }

    // function having return type (int, dobule, String, char...) and have no
    // parameter
    // static int add() {
    // int a = 5;
    // int b = 50;
    // int c = a + b;
    // return c;
    // }

    // static int add(int a , int b) {
    // int c = a + b;
    // return c;
    // }



    double ta(int basicSal){
        return 0.1 *  basicSal;
    }

    int pf(){
        return 1400;
    }
    public static void main(String[] args) {
        add();

    }
}
