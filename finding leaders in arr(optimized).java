//finding leaders in the array
//optimized approach
//Time Complexity: O(n) -> single traversal from right to left
//Space Complexity: O(n) -> ArrayList used to store leaders


import java.util.*;
import java.util.Scanner ;

public class A{
    
    private static ArrayList<Integer> leaders(int[] arr){
        int n = arr.length;
        
        //creating list to add leaders
        ArrayList<Integer> list = new ArrayList<>();
        
    //we already know that last element is leader
    int firstleader = arr[n-1];
    
    //adding first leader to the empty list
    list.add(firstleader);
    
    //adding the rest of the leaders from the arr
    // check elements from right to left
    for(int i=n-2;i>=0 ; i--){
        if(arr[i]> firstleader){
            firstleader = arr[i];
            list.add(arr[i]);
        }
    }
    
      return list;  
        
        
    }
    
    public static void main(String[] args){
        int[] arr = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> sol = leaders(arr);
        System.out.println("leaders in the arr is :"+sol);
    }
    
}








