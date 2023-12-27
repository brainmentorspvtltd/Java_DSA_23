package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderElement {

    static void findLeader(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = arr.length;

        int LeaderElement = arr[length - 1];
        list.add(LeaderElement);

        for (int i = length - 2; i >= 0; i--) {
            if (arr[i] > LeaderElement) {
                LeaderElement = arr[i];
                list.add(LeaderElement);
            }
        }
        System.out.println("Before reverse: " + list);

        // this is used to reverse the list
        Collections.reverse(list);
        System.out.println("After reverse: " + list);

    }

    public static void main(String[] args) {
        int a[] = { 16, 17, 4, 3, 5, 2 };
        findLeader(a);
    }
}
