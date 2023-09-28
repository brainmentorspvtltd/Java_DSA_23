import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weight: ");
        float weight = sc.nextFloat();
        System.out.println("Enter your Height in Meters: ");
        float height = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.println("BMI: " + BMI);

    }

}
