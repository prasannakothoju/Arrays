/// Second Largest Element in an Array without sorting
//optimized opproach

import java.util.*;
import java.util.Scanner;

public class A{
    
    public static void main(String[] args){
    //take an array and initialize it
    int[] arr = {8,3,6,4,5,3,9};
    int n = arr.length;
    
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
    System.out.println("max of the array is: "+max);
    System.out.println("Secondmax of the array is: "+secondmax);
    }
}
