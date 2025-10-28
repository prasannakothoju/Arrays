//check if an array is sorted or not
//bruteforce

import java.util.*;
import java.util.Scanner;

public class A{
    
    //function to check if array is sorted
    private static boolean sorting(int[] arr){
        int n = arr.length;
        
        //compare every pair of elements
        for(int i=0;i<n;i++){
            for(int j=i+1 ; j<n; j++){
                if(arr[i]>arr[j]){  //if any earlier element is greater than later
                    return false;   //then array is not sorted
                }
            }
        }
        return true; //if no such pair found, array is sorted
    }

   public static void main(String[] args){
       int[] arr = {3,6,9,4,8,2}; //array input
       
       boolean ans = sorting(arr); //store result
       
       System.out.print("Is the array sorted? : "+ans); //print answer
   } 
    
}
