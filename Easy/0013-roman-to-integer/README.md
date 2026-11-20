# 13. Roman to Integer

- **Difficulty:** **Easy**
- **Topics:** `Hash Table` `Math` `String`
- **LeetCode Link:** [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

## Solution Description

Traverses the Roman string from right to left. If current numeral is smaller than the previous numeral, subtract it; otherwise, add it.

## Java Solution

```java
class Solution {
    /**
     * Converts a Roman numeral to an integer.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = getValue(s.charAt(i));
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
                prevValue = currValue;
            }
        }
        return total;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
```
