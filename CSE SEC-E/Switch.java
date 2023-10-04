import java.util.Scanner;

enum FoodItem {
    PIZZA, BURGER, SWEETS, PASTA, DRINKS
}

public class Switch {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // final int PIZZA = 1;
        // final int BURGER = 2;
        // final int SWEETS = 3;
        // final int PASTA = 4;
        // final int DRINKS = 5;
        System.out.println("Enter 1 to order Pizza");
        System.out.println("Enter 2 to order Burger");
        System.out.println("Enter 3 to order Sweets");
        System.out.println("Enter 4 to order Pasta");
        System.out.println("Enter 5 to order Drinks");
        // int choice = scanner.nextInt();
        FoodItem enumChoice = FoodItem.SWEETS;
        switch (enumChoice) {
            case PIZZA:
                System.out.println("You have ordered Pizza");
                break;
            case BURGER:
                System.out.println("You have ordered Burger");
                break;
            case SWEETS:
                System.out.println("You have ordered Sweets");
                System.out.println("This is the choice " + enumChoice+ "and this is the index of the enum value :" + enumChoice.ordinal());
                break;
            case PASTA:
                System.out.println("You have ordered Pasta");
                break;
            case DRINKS:
                System.out.println("You have ordered Drinks");
                break;
            default:
                System.out.println("Invalid Input");
        }
        // scanner.close();
    }
}
