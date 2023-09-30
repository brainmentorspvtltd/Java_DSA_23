import java.util.Scanner;

enum FoodItems {
    PIZZA, BURGER, DRINKS, SWEETS, PASTA
}

public class Switch {
    public static void main(String[] args) throws Exception{
        // final int PIZZA = 1;
        // final int BURGER = 2;
        // final int DRINKS = 3;
        // final int SWEETS = 4;
        // final int PASTA = 5
        Scanner scanner = new Scanner(System.in);
        int charValue = System.in.read();
        char ch = scanner.next().charAt(0);
        // System.out.println("Enter 1 to order Pizza");
        // System.out.println("Enter 2 to order Burger");
        // System.out.println("Enter 3 to order Drinks");
        // System.out.println("Enter 4 to order Sweets");
        // System.out.println("Enter 5 to order Pasta");

        // int choice = scanner.nextInt();
        FoodItems enumChoice = FoodItems.BURGER;
        switch (enumChoice) {
            case PIZZA:
                System.out.println("You have orderd Pizza");
                break;
            case BURGER:
                // System.out.println("You have ordered Burger");
                System.out.println("This is the enum value" + enumChoice + "and this is the index" + enumChoice.ordinal());
                break;
            case DRINKS:
                System.out.println("You have orderd Drinks");
                break;
            case SWEETS:
                System.out.println("You have ordered Sweets");
                break;
            case PASTA:
                System.out.println("You have ordered Pasta");
                break;
            default:
                System.out.println("Invalid input");

        }
        // scanner.close();
    }
}
