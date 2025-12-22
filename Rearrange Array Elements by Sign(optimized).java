//Rearrange Array Elements by Sign
//optimized code

import java.util.*;

public class A{
    
    private static int[] arrange(int[] arr){
        int n = arr.length;
        
        //creating res array
        int[] res = new int[n];
        
        //indexes of pos and neg array's
        
        // posIndex will point to even indices (0, 2, 4, ...)
        // used for placing positive numbers
        int pos = 0;
        
        // negIndex will point to odd indices (1, 3, 5, ...)
        // used for placing negative numbers
        int neg = 1;
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                // Place the positive number at the current even index
                res[pos]= arr[i];
                // Move to the next even index like 0 → 2 → 4 → ...
                pos += 2;
            }
            else{
                //Put the negative number in result array at odd index
                res[neg] = arr[i];
                
                //Move to the next odd index like 1 → 3 → 5 → ...
                neg += 2;
            }
        }
        
        return res;
    }
    
   public static void main(String[] args){
    int[] arr = {1, 2, -4, -5};
    int[] sol = arrange(arr);
    
    System.out.print("after arranging the arr :");
    for(int x : sol){
        System.out.print(x+" ");
    }
   }
 }
 
 
//Time	O(N)	One pass through array
//Space	O(N)	One extra array used


