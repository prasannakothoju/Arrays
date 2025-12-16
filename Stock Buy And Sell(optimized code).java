//Stock Buy And Sell
//optimized code

import java.util.*;

public class A{
    
    private static int maxprofit(int[] prices){
        int n = prices.length;
        
int minprice = prices[0]; //Cheapest price seen so far,// first day price
        int maxprofit = 0; //Best profit we can get
        
        for(int i=0 ; i<n ; i++){
            
             // If we find a lower price, update minPrice
            if(prices[i]< minprice){
                minprice = prices[i];
            }
            
             // Otherwise, calculate profit if sold today
            else{
                int profit = prices[i]- minprice;
                
                 // Update maxProfit if this profit is better
                if(profit > maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
        
    }
    
    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int sol = maxprofit(prices);
        System.out.println("Max profit is :"+sol);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)












