package Array;

public class EvenOddSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };

        int evenSum = 0;
        int oddSum = 0;
        for (int data : arr) {
            if (data % 2 == 0) {
                evenSum += data;
            } else {
                oddSum += data;
            }
        }

        System.out.println("This is the Even Sum :" + evenSum);
        System.out.println("This is the Odd Sum :" + oddSum);
    }
}
