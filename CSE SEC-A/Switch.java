import java.nio.file.FileVisitOption;
import java.util.Scanner;

enum FoodItem {
    PIZZA, BURGER, DRINKS, PASTA, SWEETS
}

public class Switch {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // final int PIZZA = 1;
        // final int BURGER = 2;
        // final int DRINKS = 3;
        // final int PASTA = 4;
        // final int SWEETS = 5;

        // System.out.println("Enter 1 to order Pizza");
        // System.out.println("Enter 2 to order Burger");
        // System.out.println("Enter 3 to order Drinks");
        // System.out.println("Enter 4 to order Pasta");
        // System.out.println("Enter 5 to order Sweets");
        // int choice = scanner.nextInt();
        // sc.next().charAt(0)
        FoodItem enumChoice = FoodItem.BURGER;
        switch (enumChoice) {
            case PIZZA:
                System.out.println("You have orderd Pizza");
                break;
            case BURGER:
                System.out.println("You have orderd Burger");
                System.out.println("This is the enum choice" + enumChoice + "and this is the index" + enumChoice.ordinal());
                break;
            case DRINKS: 
                System.out.println("You have orderd Drinks");
                break;
            case PASTA:
                System.out.println("You have orderd Pasta");
                break;
            case SWEETS:
                System.out.println("You have orderd Sweets");
                break;

        }
        // scanner.close();
    }
}
