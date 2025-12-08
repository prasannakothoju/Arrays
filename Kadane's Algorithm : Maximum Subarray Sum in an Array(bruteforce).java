// Maximum Subarray Sum in an Array
//brute force
//The code is doing:
//Pick a starting point (i)
//Pick an ending point (j)
//Add everything between i and j
//Keep track of the biggest sum found
//It repeats this process for every possible subarray in the array.

import java.util.*;

public class A{
    
    private static int sum(int[] arr){
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0;
                
                for(int k=i;k<=j ; k++){
                    sum +=arr[k];
                }
                
                maxsum = Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
    
    public static void main(String[] args){
        int[] arr =  { 2, 3, 5, -2, 7, -4 };
        int n = arr.length;
        int sol = sum(arr);
        System.out.println("maximum sub array is :"+sol);
    }
}
    
    













