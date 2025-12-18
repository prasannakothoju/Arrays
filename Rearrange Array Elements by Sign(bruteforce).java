//Rearrange Array Elements by Sign
//bruteforce

import java.util.*;

public class A{
    
    private static int[] arrange(int[] arr){
        int n = arr.length;
        
        //creating arraylists for 2 diff sign elements i.e,pos and neg
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        //segregating the elements based on their signs
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
            
        }
        
        //creating new arr to store the result
        int[] res = new int[n]; //passing the size
        
        int i=0; // index for result array
        int p =0; // index for positive list
        int q =0;  // index for negative list
        
          // Step 3: place elements alternately
          while(p<pos.size() && q<neg.size()){
              res[i++] = pos.get(p++);  // add positive
              res[i++] = neg.get(q++);  // add negative
              
          }
        return res;
        
    }
    
    // Time Complexity (TC): O(N)
    // - One loop to separate elements: O(N)
    // - One loop to merge elements: O(N)
    
    // Space Complexity (SC): O(N)
    // - Extra ArrayLists (pos, neg) and result array are used
    
    public static void main(String[] args){
        int[] arr =  {1,2,-4,-5}; 
        int[] sol = arrange(arr); 
        System.out.print("After arranging arr :");
        
        for(int x : sol){
            System.out.print(x+" ");
        }
    }
}
