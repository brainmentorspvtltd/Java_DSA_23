import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balanceValue = 500;
        System.out.println("Enter 1 to withdraw money");
        System.out.println("Enter 2 to deposit money");
        System.out.println("Enter 3 to check balance");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Enter the amount you want to withdraw");
                int withdrawAmount = scanner.nextInt();

                if (balanceValue < withdrawAmount) {
                    System.out.println("Insufficent Balance");
                } else {
                    balanceValue = balanceValue - withdrawAmount;
                    System.out.println("This is the remaining balance :" + balanceValue);
                }

                break;

            case 2:
                System.out.println("Enter the amount you want to deposit");
                int depositAmount = scanner.nextInt();

                if (depositAmount <= 0) {
                    System.out.println("Invaild Deposit amount");
                } else {
                    balanceValue = balanceValue + depositAmount;
                    System.out.println("This is the new balance :" + balanceValue);

                }
                break;

            case 3:
                System.out.println("This is your balance :" + balanceValue);
                break;

            default:
                System.out.println("Not a valid Choice");
                break;
        }

    }
}
