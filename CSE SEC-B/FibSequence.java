import java.util.Scanner;

public class FibSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence:");
        System.out.print(first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
