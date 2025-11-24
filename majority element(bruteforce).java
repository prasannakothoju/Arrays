//Find the Majority Element that occurs more than N/2 times
// Brute Force Approach
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

public class A {

    // function
    private static int find(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > n/2){
                return arr[i];  // majority element
            }
        }

        return -1; // no majority
    }

    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};

        int sol = find(arr);
        System.out.println("Majority element is: " + sol);
    }
}
