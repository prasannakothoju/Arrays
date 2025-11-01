//finding union of arrays using MAPS
//it is an optimized approach
// Step 1 → Use a map to store elements of both arrays as keys (duplicates auto-handled).
// Step 2 → Insert all elements of arr1 and arr2 into the map.
// Step 3 → Extract keys from the map and sort them to get the union.

import java.util.*;
import java.util.Scanner;

public class A{
    
    private static ArrayList<Integer> findunion(int[] arr1, int[] arr2){
        
        //creating a map to store freq
        Set<Integer> set = new HashSet<>();
        
        // Step 1: Insert elements of arr1
        for(int num:arr1){
            set.add(num);
        }
        
        //step 2: Insert elements of arr2
        for(int num: arr2){
            set.add(num);
        }
        
        //storing unique elements into the list
        ArrayList<Integer> unionlist = new ArrayList<>(set);
        Collections.sort(unionlist);
        return unionlist;
        
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5};
        ArrayList<Integer> res = findunion(arr1,arr2);
        System.out.println("Array after union :"+res);
    }
    
}

/*
🕒 Time Complexity (TC): O((n + m) * log(n + m))
- Adding elements to the set takes O(n + m)
- Sorting the final list of unique elements takes O(u * log u),
  where u = number of unique elements (≤ n + m)

💾 Space Complexity (SC): O(n + m)
- Set and list store all unique elements
*//


