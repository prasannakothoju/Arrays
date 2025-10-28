//check if an array is sorted or not
//optimized approach

import java.util.*;
import java.util.Scanner;

public class A{
    
    //function to check if array is sorted
    private static boolean sorting(int[] arr){
        int n = arr.length;
        
        //check every element with its next element
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){  //if any element is greater than next one
                return false;       //then array is not sorted
            }
        }
        return true; //if no such case found, array is sorted
    }

   public static void main(String[] args){
       int[] arr = {3,6,9,12,15}; //array input
       
       boolean ans = sorting(arr); //store result
       
       System.out.print("Is the array sorted? : "+ans); //print answer
   } 
    
}

// TC: O(n)
// SC: O(1)
