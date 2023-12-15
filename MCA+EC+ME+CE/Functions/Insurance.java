
package Functions;

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Name: ");
        String name = sc.next();
        System.err.println("Gender: ");
        String gender = sc.next();
        System.err.println("Age: ");
        int age = sc.nextInt();
        System.err.println("City: (Metro/Non-Metro): ");
        String city = sc.next();

        System.out.println("Premium is: "
                + (checkPremium(age, gender, city) == 0 ? "Not Insured" : checkPremium(age, gender, city) + "%"));

    }

    public static int checkPremium(int age, String gender, String city) {
        gender = gender.trim();
        city = city.trim();
        System.out.println("Debug: age=" + age + ", gender=" + gender + ", city=" + city);

        if (age >= 25 && age <= 35 && gender.equals("male") && city.equals("metro"))
            return 6;
        else if (age >= 25 && age <= 40 && gender.equals("male") && city.equals("non-metro"))
            return 4;
        else if (age >= 25 && age <= 42 && gender.equals("female") && city.equals("metro"))
            return 3;
        else if (age >= 25 && age <= 45 && gender.equals("female") && city.equals("non-metro"))
            return 2;
        else
            return 0;
    }

}
