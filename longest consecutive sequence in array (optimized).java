//longest consecutive sequence in the array
//optimised approach
//TC O(n) → each number checked once
//SC O(n) → HashSet stores all numbers

import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class A{
    
    private static int find(int[] arr){
        int n = arr.length;
        
        if(n == 0 ) return 0; //if arr is empty no point in searching
        
        //take a Hashset to store the values of arr to avoid dups
         // Space Complexity so far: O(n)
        HashSet<Integer> set = new HashSet<>();
        
        //adding elements to the set
        // This loop runs n times → O(n)
        for(int num : arr){
            set.add(num);
        }
        
        //tracking of the longest sequence
        // longest stores the maximum length found
        // Uses constant extra space → O(1)
        int longest = 0;
        
        //traversing the arr again
         // Runs n times → O(n)
        for(int num : arr){
            //checking if previous element in the arr 
            //ex :{100, 4, 200, 1, 3, 2};
            // arr[0]-> 100 --> 100-1 = 99 which is not in the arr so we 
            // skip this element stops with length of 1 checks next element in the arr
            // Lookup in HashSet takes O(1) time
            if(!set.contains(num-1)){
                int current = num ;
                int count = 1;
                
                // Check consecutive numbers
                // Each number is visited only once overall
                // Total time across all loops = O(n)
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                
                //updating the longest consecutive sequence
                longest = Math.max(longest,count);
                
            // Overall Time Complexity:
            // O(n) + O(n) = O(n)
           // Overall Space Complexity:
         // HashSet stores n elements → O(n)

            }
        }
        return longest;
        
    }
    public static void main(String[] args){
        int[] arr = {100, 4, 200, 1, 3, 2};
        int sol = find(arr);
        System.out.println("longest consecutive sequence is :"+sol);
    }
}









