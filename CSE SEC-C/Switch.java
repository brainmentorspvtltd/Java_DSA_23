import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner abc = new Scanner(System.in);

        final int PIZZA = 1;
        final int BURGER = 2;
        final int PASTA = 3;
        final int SWEETS = 4;
        final int DRINKS = 5;

        System.out.println("What do you want to order?");
        System.out.println("Enter 1 to order Pizza");
        System.out.println("Enter 2 to order Burger");
        System.out.println("Enter 3 to order Pasta");
        System.out.println("Enter 4 to order Sweets");
        System.out.println("Enter 5 to order Drinks");

        int choice = abc.nextInt();

        switch (choice) {
            case PIZZA:
                System.out.println("You have ordered Pizza");
                break;
            case BURGER:
                System.out.println("You have ordered Burger");
                break;
            case PASTA:
                System.out.println("You have ordered Pasta");
                break;
            case SWEETS:
                System.out.println("You have ordered Sweets");
                break;
            case DRINKS:
                System.out.println("You have orderd Drinks");
                break;
            default:
                System.out.println("Invalid input");
        }
        abc.close();
    }
}
