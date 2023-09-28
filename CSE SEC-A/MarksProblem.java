import java.util.Scanner;

public class MarksProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scan.nextLine();
        System.out.println("Enter Class : ");
        int className = scan.nextInt();
        System.out.println("Enter the Maths Marks: ");
        float mathsMarks = scan.nextFloat();
        System.out.println("Enter Hindi marks :");
        float hindiMarks = scan.nextFloat();
        System.out.println("Enter englishMarks marks :");

        float englishMarks = scan.nextFloat();
        System.out.println("Enter socialScienceMarks marks :");

        float socialScienceMarks = scan.nextFloat();
        System.out.println("Enter physicsMarks marks :");

        float physicsMarks = scan.nextFloat();
        float obtainedMarks = mathsMarks + hindiMarks + socialScienceMarks + englishMarks + physicsMarks;
        int totalMarks = 500;
        float percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Result is ");
        System.out.println("Maths Marks: " + mathsMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Hindi Marks: " + hindiMarks);
        System.out.println("Social Science Marks: " + socialScienceMarks);
        System.out.println("Physics Marks: " + physicsMarks);
        System.out.println("Obtained marks: " + obtainedMarks);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage : " + percentage);

    }
}
