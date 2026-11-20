# 258. Add Digits

- **Difficulty:** **Easy**
- **Topics:** `Math` `Simulation` `Number Theory`
- **LeetCode Link:** [Add Digits](https://leetcode.com/problems/add-digits/)

## Solution Description

Calculates the digital root in O(1) time using modulo arithmetic properties in base 10.

## Java Solution

```java
class Solution {
    /**
     * Repeatedly adds all digits until the result has only one digit (Digital Root).
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}
```
