// Two Sum : Check if a pair with given sum exists in Array
// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
// Brute Force Approach

// Time Complexity: O(n^2) 
// Because we check all possible pairs using two nested loops

// Space Complexity: O(1)
// We are not using any extra space that grows with input size

import java.util.*;
import java.util.Scanner;

public class A{
    //function
    private static String find(int[] arr, int target){
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target) 
                    return "yes";
            }
        }
        
        return "no";
    }
    
    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int target = 14;
        String sol = find(arr, target);
        System.out.println("found target sum : " + sol);
    }
}
