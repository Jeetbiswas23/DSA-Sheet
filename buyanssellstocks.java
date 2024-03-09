package Arrays;

import java.util.*;

public class buyanssellstocks {
    public static int buyandsellstocks(int prices[]) {//price[i] is a selling price
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (BuyPrice < prices[i]) {//Profit
                int profit = prices[i] - BuyPrice;//Today's Profit
                MaxProfit = Math.max(MaxProfit, profit);
            } else {
                BuyPrice = prices[i];
            }
        }
        return MaxProfit;

    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsellstocks(prices));

    }

}
/*

"   DRY RUN    "


Initialize BuyPrice to Integer.MAX_VALUE and MaxProfit to 0.
Start iterating over the prices array.
i. For i = 0, prices[i] is 7.

BuyPrice < prices[i] -> Integer.MAX_VALUE < 7 is false.
So, we go to the else block and update BuyPrice = 7.
ii. For i = 1, prices[i] is 1.

BuyPrice < prices[i] -> 7 < 1 is false.
We update BuyPrice = 1.
iii. For i = 2, prices[i] is 5.

BuyPrice < prices[i] -> 1 < 5 is true.
profit = 5 - 1 = 4
MaxProfit becomes the maximum of 0 and 4, which is 4.
iv. For i = 3, prices[i] is 3.

BuyPrice < prices[i] -> 1 < 3 is true.
profit = 3 - 1 = 2
MaxProfit remains 4 because 4 > 2.
v. For i = 4, prices[i] is 6.

BuyPrice < prices[i] -> 1 < 6 is true.
profit = 6 - 1 = 5
MaxProfit becomes the maximum of 4 and 5, which is 5.
vi. For i = 5, prices[i] is 4.

BuyPrice < prices[i] -> 1 < 4 is true.
profit = 4 - 1 = 3
MaxProfit remains 5 because 5 > 3.
After iterating over the entire array, the function returns MaxProfit, which is 5.
Thus, the program will output 5, */
