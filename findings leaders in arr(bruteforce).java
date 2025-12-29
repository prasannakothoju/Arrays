//finding the leader
//brute force

import java.util.*;

public class A{
    
    private static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0 ;i<n ;i++){
            boolean leader = true; //We assume nums[i] is a leader initially
            
            // Loop to check all elements to the right of nums[i]
            for(int j=i+1 ;j<n; j++){ 
                
            // If any element on the right is greater
            if(arr[j]> arr[i]){
                leader = false; // nums[i] is NOT a leader
                break; // no need to check further
                
            }
                
            }
            if(leader){
                list.add(arr[i]);
            }
        }
        return list;
    }
    
    public static void main(String[] args){
        int arr[] = {1, 2, 5, 3, 1, 2};
        // Creating object of A class
        A sol = new A(); 
        ArrayList<Integer> res = sol.leaders(arr);
        System.out.println(res);
    }
    
}










