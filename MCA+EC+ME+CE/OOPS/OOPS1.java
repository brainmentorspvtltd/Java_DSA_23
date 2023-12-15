package OOPS;

interface MakeTea {
    void sugarAmout(); // abstract methods

    void milkAmount();
}

class Animal {
    void eat() {
        System.out.println("the animal can eat");
    }
}

class Dog extends Animal implements MakeTea {
    String name;

    public Dog(String dogName) {
        name = dogName;
    }

    void bark() {
        System.out.println("The dog can bark");
    }

    @Override
    public void sugarAmout() {
        System.out.println("50 gm Sugar");
    }

    @Override
    public void milkAmount() {
        System.out.println("100ml of Milk");
    }

}

public class OOPS1 {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.bark();
        tommy.eat();
    }
}
