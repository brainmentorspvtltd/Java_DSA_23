package Array;

public class ArrayQ1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };

        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum = sum + arr[i];
        // }
        for (int data : arr) {
            sum = sum + data;
        }
        System.out.println("This is the sum :" + sum);
    }
}
