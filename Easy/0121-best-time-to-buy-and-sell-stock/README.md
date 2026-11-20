# 121. Best Time to Buy and Sell Stock

- **Difficulty:** **Easy**
- **Topics:** `Array` `Dynamic Programming`
- **LeetCode Link:** [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

## Solution Description

One-pass greedy approach tracking the lowest historical price and maximum possible profit at each day.

## Java Solution

```java
class Solution {
    /**
     * Finds maximum profit with at most one transaction.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
```
