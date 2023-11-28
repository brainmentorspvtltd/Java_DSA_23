import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("This is week day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("This is week end");
                break;
            default:
                break;
        }
    }
}
