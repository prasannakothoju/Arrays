//left rotate the array
//bruteforce approach
//Input: [1, 2, 3, 4, 5]-->So, we just shifted everything left and moved the first element to the end.
//Output: [2, 3, 4, 5, 1]
//Now, if you rotate it to the left by one, it’s like pushing all numbers one step left:
//The 1 (first number) moves out of the row for a moment.
//Each of the others moves one step left:

import java.util.*;
import java.util.Scanner;

public class A{
    
    public static void main(String[] args){
        
        int[] arr ={1, 2, 3, 4, 5};
        int n = arr.length;
        
    //creating a temp for storing first element
    //We keep the first element (1) safe in a temporary variablecalled temp,because when we shift everything left, it will be replaced.
    
    int temp = arr[0];
    
    //This loop moves every number one position to the left:
    for(int i=0;i<n-1;i++){
       arr[i] = arr[i+1];
    }
    
    //after moving all elements move the first element to last(we stored in temp)
    arr[n-1]=temp;
    System.out.print("After left rotation: ");
    
    //printing all the nums in arr after left rotation
    for(int num:arr){
        System.out.print(num+" ");
    }
    
    }
}

//Type	Complexity	Explanation
T//ime Complexity (TC)	O(n)	Each element is shifted once
//Space Complexity (SC)	O(1)	Only one extra variable used













