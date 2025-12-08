//Kadane's Algorithm : Maximum Subarray Sum in an Array
//optimized code

import java.util.*;

public class A{
    
    private static int sum(int[] arr){
        int n = arr.length;
        
        int maxsum = arr[0];
        int currentsum =0;
        
        for(int num : arr){
            currentsum += num;
            
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
            
            if(currentsum < 0){
                currentsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int sol = sum(arr);
        System.out.println("Max sub array sum is "+sol);
    }
}



















