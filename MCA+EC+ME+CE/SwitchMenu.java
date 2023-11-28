import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to order PIZZA");
        System.out.println("Press 2 to order BURGER");
        System.out.println("Press 3 to order DRINKS");
        System.out.println("Press 4 to order SWEETS");
        System.out.println("Press 5 to order SNACKS");

        char foodChoice = scanner.next().charAt(0);

        // int, byte, char, String
        // switch (foodChoice) {
        // case 1:
        // System.out.println("You have ordered PIZZA");
        // break;
        // case 2:
        // System.out.println("You have ordered BURGER");
        // break;
        // case 3:
        // System.out.println("You have ordered DRINKS");
        // break;
        // case 4:
        // System.out.println("You have ordered SWEETS");
        // break;
        // case 5:
        // System.out.println("You have ordered SNACKS");
        // break;
        // default:
        // System.out.println("Not a valid Choice");
        // }

        // switch (foodChoice) {
        //     case "1":
        //         System.out.println("You have ordered PIZZA");
        //         break;
        //     case "2":
        //         System.out.println("You have ordered BURGER");
        //         break;
        //     case "3":
        //         System.out.println("You have ordered DRINKS");
        //         break;
        //     case "4":
        //         System.out.println("You have ordered SWEETS");
        //         break;
        //     case "5":
        //         System.out.println("You have ordered SNACKS");
        //         break;
        //     default:
        //         System.out.println("Not a valid Choice");
        // }


        // switch (foodChoice) {
        //     case 'P':
        //         System.out.println("You have ordered PIZZA");
        //         break;
        //     case 'B':
        //         System.out.println("You have ordered BURGER");
        //         break;
        //     case 'D':
        //         System.out.println("You have ordered DRINKS");
        //         break;
        //     case 'S':
        //         System.out.println("You have ordered SWEETS");
        //         break;
        //     case 'Z':
        //         System.out.println("You have ordered SNACKS");
        //         break;
        //     default:
        //        System.out.println("Not a valid Choice");
        // }


        byte ch = 2;
        switch (ch) {
            case 1:
                System.out.println("You have ordered PIZZA");
                break;
            case 2:
                System.out.println("You have ordered BURGER");
                break;
            case 3:
                System.out.println("You have ordered DRINKS");
                break;
            case 4:
                System.out.println("You have ordered SWEETS");
                break;
            case 5:
                System.out.println("You have ordered SNACKS");
                break;
            default:
               System.out.println("Not a valid Choice");
        }

    }
}
