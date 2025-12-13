//Stock Buy and Sell
//bruteforce

import java.util.*;

public class Main {

    // Brute Force Method
    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int maxProfit = 0;  // store the best profit found

        // Try buying on each day i
        for (int i = 0; i < n; i++) {

            // Try selling on each future day j
            for (int j = i + 1; j < n; j++) {

                int profit = prices[j] - prices[i]; // profit = sell - buy

                // Update maxProfit if current profit is bigger
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit; // final answer
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}


//Time Complexity: O(n²)
//Space Complexity: O(1)
