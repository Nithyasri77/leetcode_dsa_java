# 231. Power of Two

- **Difficulty:** **Easy**
- **Topics:** `Math` `Bit Manipulation` `Recursion`
- **LeetCode Link:** [Power of Two](https://leetcode.com/problems/power-of-two/)

## Solution Description

A power of two in binary has exactly one set bit (e.g. 1000). Subtracting 1 flips all bits up to that bit (0111). Therefore `n & (n - 1) == 0`.

## Java Solution

```java
class Solution {
    /**
     * Checks if n is a power of two using bitwise AND.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
```
