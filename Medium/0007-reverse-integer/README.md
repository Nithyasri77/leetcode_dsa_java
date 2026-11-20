# 7. Reverse Integer

- **Difficulty:** **Medium**
- **Topics:** `Math`
- **LeetCode Link:** [Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## Solution Description

Pops digits one by one from `x` and pushes them to `rev`, checking for 32-bit integer overflow before multiplying by 10.

## Java Solution

```java
class Solution {
    /**
     * Reverses digits of a 32-bit signed integer with 32-bit overflow handling.
     * Time Complexity: O(log10(n))
     * Space Complexity: O(1)
     */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
```
