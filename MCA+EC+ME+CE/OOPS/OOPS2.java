package OOPS;

class Dog {
    String name;

    public Dog(String dogName) {
        name = dogName;
    }

}

public class OOPS2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("TOMMY");
        System.out.println(dog1.name);
    }
}
