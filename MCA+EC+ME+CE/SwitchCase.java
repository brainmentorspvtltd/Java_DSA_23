import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        enum FoodItems {
            BURGER, PIZZA, DRINK, SHAKES, PASTA

        }

        // final int BURGER = 1;
        // final int PIZZA = 2;
        // final int DRINK = 3;
        // final int SHAKES = 4;
        // final int PASTA = 5;
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose from the menu below");
        System.out.println("Enter 1 to order Burger");
        System.out.println("Enter 2 to order Pizza");
        System.out.println("Enter 3 to order Drink");
        System.out.println("Enter 4 to order Shakes");
        System.out.println("Enter 5 to order Pasta");
        FoodItems choice = FoodItems.PASTA;

        long a = 12000L;
        // int choice = scanner.nextInt();
        switch (choice) {
            case BURGER:// the only thing wrong with this type of case naming is that we or the
                // developer won't ever know which case is for what. In order to solve this
                // issue we have enums. Enums were introduced from Java 5 onwards.
                System.out.println("Thank you for ordering Burger, It'll be ready in 5 mins");
                break;
            case PIZZA:
                System.out.println("Thank you for ordering Pizza, It'll be ready in 5 mins");
                break;
            case DRINK:
                System.out.println("Thank you for ordering Drink, It'll be ready in 5 mins");
                break;
            case SHAKES:
                System.out.println("Thank you for ordering Drinks, It'll be ready in 5 mins");
                break;
            case PASTA:
                System.out.println("Thank you for ordering Pasta, It'll be ready in 5 mins");
                break;
            default:
                System.out.println("OOPS!! Looks like you have entered a wrong input");
                break;
        }

        // scanner.close();

    }
}
