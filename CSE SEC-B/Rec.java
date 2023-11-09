public class Rec {

    static void fn1() {
        System.out.println("This is fn1");
    }

    static void fn2() {
        fn1();
        System.out.println("This is fn2");

    }

    static void fn3() {
        fn2();
        System.out.println("This is fn3");

    }

    public static void main(String[] args) {
        fn3();
    }
}