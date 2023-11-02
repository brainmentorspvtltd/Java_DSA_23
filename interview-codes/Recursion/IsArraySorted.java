public class IsArraySorted {

    static boolean isSorted(int arr[], int index){
        if(index == arr.length){
            return true;
        }
        if(arr[index-1] > arr[index]){
            return false;
        }
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {5,7,9,13};
        System.out.println(isSorted(arr, 1));
    }
}
