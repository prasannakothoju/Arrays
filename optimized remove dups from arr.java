//optimized code for removing dups from the arr

import java.util.*;
import java.util.Scanner;

public class A{
    
    public static void main(String[] args){
        int[] arr = {5,3,7,3,5,8,2};
        int n = arr.length;
        
        // HashSet automatically ignores duplicate values
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Array after removing duplicates :");
        
        //looping through all the elements in the array
        for(int num:arr){
         set.add(num); //adds element only if it's not already in the set
        }
        
        for(int num:set){ //print all unique elements
            System.out.print(num+" ");
        }
    }
}


//TC :O(n) We go through the entire array once, and each insertion into the HashSet takes constant time on average
//SC :O(n) We use an extra HashSet to store all unique elements from the array.In the worst case (when all elements are unique), the set will hold n elements, so the space complexity is O(n).

  
Space Complexity	O(n)	The HashSet stores all unique elements.
