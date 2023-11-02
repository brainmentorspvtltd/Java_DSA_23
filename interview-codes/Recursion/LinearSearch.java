public class LinearSearch {

    static int findIndex(int arr[], int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
    public static void main(String[] args) {
        int arr[] ={4,5,56,8,9};
        int target =9;
        System.out.println(findIndex(arr, target, 0));
    }
}
