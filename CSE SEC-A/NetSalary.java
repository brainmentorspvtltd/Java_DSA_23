import java.util.Scanner;

public class NetSalary{

    public static void main(String[] args) {
        System.out.println("Enter your Basic salary");
        Scanner scan = new Scanner(System.in);
        float basic_salary = scan.nextFloat();
        float hra = basic_salary*30/100;
        float ta = basic_salary*20/100;
        float da = basic_salary*10/100;
        int pf =1500;

        float net_Salary = basic_salary + hra + ta +da -pf;

        System.out.println("Basic salary : " + basic_salary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("TA : " + ta);
        
        System.out.println("Net salary : " + net_Salary);
    }
}