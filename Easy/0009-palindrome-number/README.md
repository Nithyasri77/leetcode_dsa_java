# 9. Palindrome Number

- **Difficulty:** **Easy**
- **Topics:** `Math`
- **LeetCode Link:** [Palindrome Number](https://leetcode.com/problems/palindrome-number/)

## Solution Description

Reverses only the second half of the number and compares it with the first half, avoiding overflow and string allocation.

## Java Solution

```java
class Solution {
    /**
     * Determines whether an integer is a palindrome without converting to a string.
     * Time Complexity: O(log10(n))
     * Space Complexity: O(1)
     */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
```
