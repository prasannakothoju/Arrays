//finding the missing num in an array
//bruteforce

import java.util.*;
import java.util.Scanner;

public class A{

    private static int missingnum(int[] arr,int n){
        
        for(int i=1;i<=n;i++){
            boolean found = false;
            
            //This line compares the element at index j in the array (arr[j]) with our number i.If they’re equal, that means we found the number in the array.
            for(int j=0;j<arr.length;j++){
                if(arr[j]== i){
                    found = true;
                    break;
                }
                
            }
            //f found is still false, it means the number i was not present in the array.So we immediately return that number — that’s our missing number.
            if(!found)return i; 
            
        }
        return -1; //if no num is missing
    }
    
    public static void main(String[] arg){
        int[] arr = {0,1,3,4};
        int n = 5;
        int sol = missingnum(arr,n);
        System.out.println("Missing num is :"+sol);
    }
    
}
 // ✅ Time Complexity: O(n²)  (because of two loops)
// ✅ Space Complexity: O(1)   (no extra memory used)











