//Move all Zeros to the end of the array
//optimized approach
//Move all zeros in the array to the end without changing the order of the non-zero elements — and do it without using any extra array.
//In-place sorting
//Step 1 → Use a pointer j to track the position of the next non-zero element.
//Step 2 → Traverse the array; when a non-zero is found, place it at arr[j] and increment j.
//Step 3 → After traversal, fill remaining positions with zeros.

import java.util.*;
import java.util.Scanner;

public class A{
    
    //function to move zeros
    public static void movezeros(int[] arr){
        int n = arr.length;
        
        //j keeps track of the next position where a non-zero element should go.
        int j =0; // pointer for placing non-zero elements
        
        // Step 1: Move all non-zero elements to front
        for(int i=0;i<n;i++){
            if(arr[i] !=0){
                arr[j] = arr[i];
                j++;
            }
        }
        
        // Step 2: Fill remaining positions with zeros
       //After placing all non-zero elements, j will stop at the first zero position.So we just fill the rest with zeros.
        while(j<n){
            arr[j]=0;
            j++;
      
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        System.out.println("Original array :"+Arrays.toString(arr));
        movezeros(arr);
        System.out.println("Array after moving zeros :"+Arrays.toString(arr));
    }
}
// ⏱ Time Complexity: O(n)
// 💾 Space Complexity: O(1)















