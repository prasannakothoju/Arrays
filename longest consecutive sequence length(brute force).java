//longest consecutive sequence in the array
//TC O(n²) → one loop + repeated searching using contains
//SC O(1) → no extra memory used (only variables)

import java.util.*;
import java.util.Scanner;

public class A{
    
    private static int find(int[] arr){
        int n = arr.length;
        
        //initially it is set to 0
        //later updated to the maximum length
        int longest = 0 ; 
        
        //loop thr each element in the arr
        for(int i=0;i<n;i++){
            int current = arr[i]; //starting num of the sequence
            
            int count = 1; // count starts from 1 because the current number itself is counted

              // Keep checking if the next consecutive number exists
              while(contains(arr,current+1)){
                  current++; //next num
                  count++;  //sequence length inc
                  
              }
              // Update longest if current sequence is longer
              longest = Math.max(longest,count);
        }
        return longest;
        
    }
    
    //helper function to find whether next consecutive number exists in the array or not
    private static boolean contains(int[] arr, int target){
        for(int num : arr){
            if(num == target){
                return true;
            }
            
            
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] arr = {100, 4, 200, 1, 3, 2};
        int sol = find(arr);
        System.out.println(sol);
    }
}


















