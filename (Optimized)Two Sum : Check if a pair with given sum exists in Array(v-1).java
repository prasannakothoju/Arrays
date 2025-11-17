// Two Sum : Variant 1 (Optimized)
// Return YES if any two numbers in the array sum to the target.
// Otherwise return NO.

// Time Complexity (TC): O(n)
// We check each element only once using a HashSet.
//
// Space Complexity (SC): O(n)
// HashSet stores elements we have seen so far.

import java.util.*;
import java.util.Scanner;

public class A{
    private static String find(int[] arr, int target){
        int n = arr.length;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            int complement = target-num; // what number we need to form the target
            
            // If complement already exists in the set → pair found
            if(set.contains(complement))return "yes";  
            
            // Otherwise add current number to the set
            set.add(num);
        }
        return "no";
    }
    public static void main(String[] args){
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String sol = find(arr,target);
        System.out.println("found 2 sum of target :"+sol);
    }
}























