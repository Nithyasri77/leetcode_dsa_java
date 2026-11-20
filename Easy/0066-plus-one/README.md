# 66. Plus One

- **Difficulty:** **Easy**
- **Topics:** `Array` `Math`
- **LeetCode Link:** [Plus One](https://leetcode.com/problems/plus-one/)

## Solution Description

Walks backward from the least significant digit. If < 9, increments and returns. If all are 9, allocates a new array starting with 1.

## Java Solution

```java
class Solution {
    /**
     * Increments the large integer represented by digits by one.
     * Time Complexity: O(n)
     * Space Complexity: O(n) in worst case (e.g. 999 -> 1000), otherwise O(1)
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
```
