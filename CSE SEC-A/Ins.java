class Parent {

}

class A extends Parent {

}

class B extends Parent {

}

public class temp {
    public static void main(String[] args) {
        Parent a = new A();
        Parent b = new B();
        System.out.println(a instanceof A);
        System.out.println(b instanceof B);
        System.out.println(a instanceof B);
        System.out.println(b instanceof A);

    }
}


//
