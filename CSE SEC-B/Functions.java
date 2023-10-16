public class Functions {

    // no return type and no parameters
    static void sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("This is the sum :" + c);
    }

    // no return type but having parameters
    static void sum2(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("This is the sum :" + c);
    }

    // return type with no parameters
    static int sum3() {
        int a = 10;
        int b = 20;
        int c = a + b;
        // System.out.println("This is the sum :" + c);
        return c;
    }

    // fn having return type as well as the parameters
    static int sum4(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        return c;
        // System.out.println("This is the sum :" + c);
    }

    public static void main(String[] args) {
        Functions obj = new Functions(); // here we are creating the object of class Function
        // obj.sum();//to call non static class members
        sum();// here we are calling the static class members
        sum2(2, 4);
        int res = sum3(); // here sum3 is returning a value of type int and here we are storing that value
        System.out.println(res); // in variable res
        int res2 = sum4(23, 33);// here sum4 is returning a value of type int and here we are storing that value
                                // in variable res2
        System.out.println(res2); // in variable res

    }
}
