/// Second Largest Element in an Array without sorting

import java.util.*;
import java.util.Scanner;

public class A{
    
    //method to find max and second max
    public static int findSecondMax(int[] arr){
        //declaring max values
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        
        //“Is this number bigger than the biggest one we’ve seen so far?”
        for(int num : arr){
            if(num>max){ //if yes
                secondmax = max; //we make the old largest become the second largest.Because now we found someone even bigger!
                max = num; //This number is the new largest
            }
            
            else if(num>secondmax && num != max){
                secondmax = num; //If the number is not the biggest,
                     //but it’s still bigger than the current second biggest,
                              //then it becomes the new second largest.
            }
        }
        return secondmax;
    }
    
    public static void main(String[] args){
    //take an array and initialize it
    int[] arr = {8,3,6,4,5,3,9};
    int n = arr.length;
    
    int secondmax = findSecondMax(arr);
    System.out.print("Secondmax of the array is"+secondmax);
    }
}
