
public class Sum {
    // this is user defined main method
    public static void main() {
        System.out.println("User Defined");
    }

    public static void main(int a) {
        System.out.println("Int wala main");
    }

    public static void main(String a) {
        System.out.println("String wala main");
    }

    public static void main(char a) {
        System.out.println("char wala main");
    }

    public static void main(float a) {
        System.out.println("float wala main");
    }

    public static void main(boolean a) {
        System.out.println("bool wala main");
    }

    // this is java defined main method
    public static void main(String[] args) {
        System.out.println("Java Defined");
        main(); // here i am calling the user defined main method
        main(0);
        main(false);
        main(0);
        main('A');
        main("Shubham");
    }

}
