// package Array;

// public class Array1 {

//     // read
//     static void arrayRead(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");

//         }
//     }

//     // update
//     static void arrayUpdate(int arr[], int index, int newValue) {
//         arr[index] = newValue;
//     }

//     static void arrayDelete(int arr[], int index) {

//         System.out.println("This is before delete");
//         arrayRead(arr);
//         if (index >= 0 || index <= arr.length) {
//             for (int i = index; i < arr.length; i++) {
//                 arr[index] = arr[index + 1];
//             }
//             // arr[arr.length - 1] = 0;
//         }
//         System.out.println("This is after delete");
//         arrayRead(arr);

//     }

//     public static void main(String[] args) {

//         // create
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         // int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9, 0 };

//         // int[] arr2 = { 1, 2, 3, 4 };
//         // int arr3[] = new int[20];

//         // read

//         arrayDelete(arr, 1);

//     }
// }

package Array;

public class Array1 {

    static void arrayRead(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void arrayDelete(int a[], int index) {
        if (index >= 0 || index <= a.length) {
            for (int i = index; i < a.length; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = 0;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 8, 9, 4, 5, 66, 12, 332, 45 };
        int[] b = { 1, 2 };
        int[] c = new int[20];

    }
}