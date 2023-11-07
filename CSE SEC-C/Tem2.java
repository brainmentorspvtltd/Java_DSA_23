public class Tem2 {

    // this fn is non static
    void func_1() {
    }

    static void func_2() {
    }

    public static void main(String[] args) {
        func_2();
        Tem2 out = new Tem2();
        out.func_1();
    }
}
