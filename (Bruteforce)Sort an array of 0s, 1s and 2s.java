//Sort an array of 0s, 1s and 2s
//using bubble sort
//brute force

import java.util.*;
import java.util.Scanner;

public class A{
    
    //function
    private static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            //swap
            if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0,1,2,0,1,2};
        sort(arr);
          System.out.println(Arrays.toString(arr));
        
    }
}

 // -----------------------------
        // Brute-force approach: Bubble Sort
        // -----------------------------
        // Time Complexity (TC): O(N^2)
        //  - Outer loop runs N times
        //  - Inner loop runs up to N times for each outer iteration
        //  - Total ~ N*N comparisons/swaps in worst case
        //
        // Space Complexity (SC): O(1)
        //  - Sorting is done in-place
        //  - No extra array or data structures used
        // -----------------------------







