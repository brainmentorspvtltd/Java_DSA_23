import java.util.Scanner;

public class TempratureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        float tempInfh = ((temp * 9) / 5) + 32;
        System.out.println("temp in fh. is " + tempInfh);
    }
}

