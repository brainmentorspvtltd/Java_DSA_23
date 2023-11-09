public class Functions {



    // fn having no return type with no parameters
     void sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("the sum is :" + c);
    }



    // fn having no return type but having parameters
    void sum2(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("the sum is :" + c);
    }


    // fn having return type without parameters
    int sum3() {
        int a = 5;
        int b = 50;
        int c = a + b;
        return c;
    }



    // fn having return type as well the parameters
    static int sum4(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        int f = a -b; // SRP break
        return c;
    }

    public static void main(String[] args) {
        Functions gg = new Functions();
        gg.sum();
        gg.sum2(0, 0);
        gg.sum3();
        sum4(0, 0);

    }
}
