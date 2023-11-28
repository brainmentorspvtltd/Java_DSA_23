import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ager");
        int age = scanner.nextInt();
        // float age2 = 22.5;
        float age2 = 22.5f;
        if (age >= 18 || age < 100) {
            System.out.println("You can Drive");
        } else if (age >= 65) {
            System.out.println("You are medically not fit to drive");
        } else {
            System.out.println("You cannot Drive");
        }
    }
}
