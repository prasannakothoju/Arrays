//Union of Two Sorted Arrays
//Approach: Using Set
//Simple steps:
//Step 1 → Insert all elements of arr1 into a set (duplicates automatically removed).
//Step 2 → Insert all elements of arr2 into the same set.
//Step 3 → Convert the set into a sorted list or array to get union in ascending order.

import java.util.*;

public class A {

    //function to find union
    private static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        // Step 1: Add elements of arr1
        for (int num : arr1) {
            set.add(num);
        }

        // Step 2: Add elements of arr2
        for (int num : arr2) {
            set.add(num);
        }

        // Step 3: Convert set to list and sort
        ArrayList<Integer> unionList = new ArrayList<>(set);
        Collections.sort(unionList);

        return unionList;
    }

    //main method to test
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};

        ArrayList<Integer> result = findUnion(arr1, arr2);

        System.out.println("Union of two sorted arrays: " + result);

        // ⏱ Time Complexity: O((n + m) log(n + m))
        //    → O(n + m) for inserting + O(k log k) for sorting the set elements
        // 💾 Space Complexity: O(n + m)
        //    → Using an extra set to store union elements
    }
}
