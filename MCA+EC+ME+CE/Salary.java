import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your basic Salary");
        int basicSalary = scanner.nextInt();
        double HRA = (0.3 * basicSalary);
        int DA = (int) (0.2 * basicSalary);
        int TA = (int) (0.1 * basicSalary);
        int PF = 1400;

        int netSalary = (int) (basicSalary + HRA + DA + TA - PF);
        System.out.println("This is your net salary :" + netSalary);
    }
}