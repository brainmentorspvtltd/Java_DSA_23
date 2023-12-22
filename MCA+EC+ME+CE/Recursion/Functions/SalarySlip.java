package Functions;

import java.util.Scanner;

public class SalarySlip {

    static double HRA(double basicSalary) {
        return 0.3 * basicSalary;
    }

    static double DA(double basicSalary) {
        return 0.2 * basicSalary;
    }

    static double PF() {
        return 1400.0;
    }

    static double TA(double basicSalary) {
        return 0.1 * basicSalary;
    }

    static double netSalary(double basicSalary) {
        double HRA = HRA(basicSalary);
        double TA = TA(basicSalary);
        double DA = DA(basicSalary);
        double PF = PF();
        return basicSalary + HRA + TA + DA - PF;
    }

    static void printStatement(String msg, double data) {
        System.out.println(msg + data);
    }

    static void printSalary(double basicSalary) {
        double HRA = HRA(basicSalary);
        double TA = TA(basicSalary);
        double DA = DA(basicSalary);
        double PF = PF();

        System.out.println("This is the basic salary :" + basicSalary);
        printStatement("This is the basic salary", basicSalary);
        System.out.println("This is the HRA :" + HRA);
        System.out.println("This is the TA :" + TA);
        System.out.println("This is the PF :" + PF);
        System.out.println("This is the DA :" + DA);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Basic Salary");
        double basicSalary = scanner.nextDouble();

        double salary = netSalary(basicSalary);

        System.out.println("this is the net salary :" + salary);

        printSalary(basicSalary);

        scanner.close();

    }
}
