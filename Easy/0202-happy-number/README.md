# 202. Happy Number

- **Difficulty:** **Easy**
- **Topics:** `Hash Table` `Math` `Two Pointers`
- **LeetCode Link:** [Happy Number](https://leetcode.com/problems/happy-number/)

## Solution Description

Models the sequence as a linked list and applies Floyd's cycle detection (tortoise and hare) in O(1) auxiliary space.

## Java Solution

```java
class Solution {
    /**
     * Determines if a number is happy using Floyd's Cycle-Finding Algorithm.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
```
