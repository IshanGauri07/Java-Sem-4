// Write a Java program to remove duplicate elements from an array.

import java.util.*;

public class RemoveDuplicate2 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.print("Array after removing duplicates: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
