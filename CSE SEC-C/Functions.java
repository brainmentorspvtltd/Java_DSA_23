public class Functions {



    // this is the first type of fn.

    //fn having no return type (void) and no parameter
    void sum() {
        int a = 20;
        int b = 30;
        int c = a + b;
        System.out.println("This is the sum :" + c);
    }



    // fn having no return type (void) but having parameters
    void sum2(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("This is the sum :" + c);
    }



    // fn having return type(in this case it is int) but have no parameters
    int sum3() {
        int a = 20;
        int b = 66;
        int c = a + b;
        int g = a -b;
        return c;
    }


    //fn having return type (int) as well as the parameters
    int sum4(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        Functions obj = new Functions();
        // obj.sum();

        int result = obj.sum3();

       int result2 = obj.sum4(22, 55);

       System.out.println(result);
    }
}