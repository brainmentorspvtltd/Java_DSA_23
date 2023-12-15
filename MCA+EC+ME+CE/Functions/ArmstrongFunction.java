package Functions;


import java.util.Scanner;

public class ArmstrongFunction {


   static int calcLength(int num){
    int length = 0;
        while (num != 0) {
            num = num / 10;
            length++;
        }
        return length;
   }


   static int findPower(int base, int exp){
    int power = 1;
     for (int i = 1; i <=exp ; i++) {
            power = power * base;
        }
        return power;
   }


//    static void isArmstrong(int num){
//     int numLen = calcLength(num);
//     int sum = 0;
//     int copy1= num;
//      while (num != 0) {
//             int lastDigit = num % 10;
//             sum = sum + findPower(lastDigit, numLen);
//             num = num / 10;
//         }

//         if(sum == copy1){
//             System.out.println("Armstrong");
//         }
//         else{
//             System.out.println("Not Armstrong");
//         }

//    }


  static int isArmstrong(int num){
    int numLen = calcLength(num);
    int sum = 0;
     while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + findPower(lastDigit, numLen);
            num = num / 10;
        }

        return sum;

   }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int res = isArmstrong(num);

        if(res == num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
