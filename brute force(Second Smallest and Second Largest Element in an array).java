//Second Smallest and Second Largest Element in an array
//bruteforce approach
//by using sorting method

import java.util.*;
import java.util.Scanner;

public class A{
    
    public static void main(String[] args){
        
        int[] arr = {4,6,1,8,3,7};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("second smallest:"+arr[1]);
        System.out.println("Second largest:"+arr[n-2]);
    }
}
