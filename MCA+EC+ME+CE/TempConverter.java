import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temp value");
        int tempValue = scanner.nextInt();
        System.out.println("Enter the conversion unit");
        char unit = scanner.next().charAt(0);

        if (unit == 'C') {
            int result = ((tempValue - 32) * 5) / 9;
            System.out.println("This is the temp in Celcius :" + result);

            // convert the tempValue from F to C

        } else if (unit == 'F') {
            // convert the tempValue from C to F
            int result = ((tempValue * 9) / 5) + 32;
            System.out.println("This is the temp in Farenheit :" + result);
        } else {
            System.out.println("Invalid Temp unit");
        }
    }
}