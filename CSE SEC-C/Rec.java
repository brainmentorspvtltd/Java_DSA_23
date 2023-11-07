public class Rec {

    static void func_1() {
        System.out.println("This is Fn 1");
    }

    static void func_2() {
        func_1();
        System.out.println("This is Fn 2");
    }

    static void func_3() {
        func_2();
        System.out.println("This is Fn 3");
    }

    public static void main(String[] args) {
        func_3();
    }
}
