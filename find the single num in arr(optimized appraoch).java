//Find the number that appears once
//optimized approach

import java.util.*;
import java.util.Scanner;

public class A{
    
    private static int find(int[] arr){
        int n = arr.length;
        
        //This creates a variable xorr and sets it to 0.This variable will hold the result after performing XOR on all elements
        int xor = 0;
        
        for(int i=0;i<n;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
    
    public static void main(String[] args){
        int[] arr = {3,5,7,4,5,7,4};
        int sol = find(arr);
        System.out.println("single num in an array is :"+sol);
    }
}

//Time	O(n)	We loop through all elements once
//Space	O(1)	We use only one variable (xor)

//a ^ a = 0 → Any number XORed with itself becomes 0.
//a ^ 0 = a → Any number XORed with 0 remains unchanged.
//XOR is commutative → order doesn’t matter:
//a ^ b ^ a = b

/*4 ^ 1 ^ 2 ^ 1 ^ 2
= 4 ^ (1 ^ 1) ^ (2 ^ 2)
= 4 ^ 0 ^ 0
= 4 */

/*
Let’s go step by step for arr = {4, 1, 2, 1, 2} 👇

Step	Element	Calculation	Result (xorr)
Start	—	xorr = 0	0
1	4	0 ^ 4-->	4
2	1	4 ^ 1	--> 5
3	2	5 ^ 2	--> 7
4	1	7 ^ 1 --> 6
5	2	6 ^ 2	--> 4 ✅

After the loop ends, xorr = 4
*/

























