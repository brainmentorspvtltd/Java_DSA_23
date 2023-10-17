public class Functions {

    // fn with no return type and no params
    static void sum() {
        int a = 10;
        int b = 20;

        int c = a + b;

        System.out.println("the result is :" + c);
    }


    //fn with no return but having params
    static void sum2(int x, int y) {
        int a = x;
        int b = y;

        int z = a + b;

        System.out.println("the result is :" + z);
    }


    //fn with return type as well as params
    static int sum3(int x, int y) {
        int a = x;
        int b = y;

        int z = a + b;

        return z;

        // System.out.println("the result is :" + z);
    }



    //fn with return type but having no params
     static int sum4() {
        int a = 10;
        int b = 10;

        int z = a + b;

        return z;

        // System.out.println("the result is :" + z);
    }

    public static void main(String[] args) {
        sum();
        sum2(5, 6);
       int res = sum3(6, 50);
        // Functions obj = new Functions();
        // for (int i = 1; i < 500; i++) {
        // obj.sum();

        // }
    }
}