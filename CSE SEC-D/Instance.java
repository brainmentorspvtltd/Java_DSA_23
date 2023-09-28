class Parent {
}

class Child1 extends Parent {
}

class Child2 extends Parent {
}

public class Instance {
    public static void main(String[] args) {
        Parent a = new Child1();
        Parent b = new Child2();

        System.out.println(a instanceof Child1);
        System.out.println(b instanceof Child2);

        System.out.println(a instanceof Child2);
        System.out.println(b instanceof Child1);

    }
}
