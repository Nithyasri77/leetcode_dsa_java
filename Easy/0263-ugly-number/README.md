# 263. Ugly Number

- **Difficulty:** **Easy**
- **Topics:** `Math`
- **LeetCode Link:** [Ugly Number](https://leetcode.com/problems/ugly-number/)

## Solution Description

Repeatedly divides `n` by 2, 3, and 5 while divisible. If the resulting number is 1, it is ugly.

## Java Solution

```java
class Solution {
    /**
     * Determines whether n is an ugly number (prime factors limited to 2, 3, 5).
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
```
