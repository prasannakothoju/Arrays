//Find the number that appears once in an array
//better appraoch
//using hashmaps

import java.util.*;
import java.util.Scanner;

public class A{
    
    private static int find(int[] arr){
        int n = arr.length;
        
        //Count the frequency of each number
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
           int value = map.getOrDefault(arr[i],0);
           map.put(arr[i],value+1);
        }
        
        //Find which number appears once
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
    
    public static void main(String[] args){
        int[] arr = {4, 1, 2, 1, 2};
        int sol = find(arr);
        System.out.println("single num in an array :"+sol);
    }
}













