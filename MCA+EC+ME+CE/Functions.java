public class Functions {

    // fn having no return type and no parameter
    static void add() {
        int a = 5;
        int b = 50;
        System.out.println("This is the sum :" + (a + b));
    }

    // fn having no return type but have parameter
    static void add2(int a, int b) {
        System.out.println("This is the sum :" + (a + b));

    }

    // void add2(String a, String b) {
    // System.out.println("This is the sum :" + (a + b));

    // }

    // fn having return type but no parameter
    int add3() {
        int a = 5;
        int b = 23;
        return a + b;
        // System.out.println("This is the sum :" + (a + b));

    }

    // fn having return type as well as the parameter
    int add4(int a, int b) {
        System.out.println("This is the sum :" + (a + b));
        return a + b;
    }

    public static void main(String[] args) {
        Functions obj = new Functions();
        add(); // this is a static member
        add2(6, 42); // this is also a static member
        // int result = obj.add3();
        // System.out.println("This is the result :" + result);
        // int result = obj.add4(45, 55);

        // System.out.println(add());
        System.out.println(obj.add4(45, 55));

        System.out.println("This is the result ");
    }
}