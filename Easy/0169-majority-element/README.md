# 169. Majority Element

- **Difficulty:** **Easy**
- **Topics:** `Array` `Hash Table` `Divide and Conquer` `Sorting` `Counting`
- **LeetCode Link:** [Majority Element](https://leetcode.com/problems/majority-element/)

## Solution Description

Boyer-Moore Voting Algorithm maintains a candidate and a counter. Because the majority element appears more than n/2 times, it survives all cancellations.

## Java Solution

```java
class Solution {
    /**
     * Finds the majority element that appears more than ⌊n / 2⌋ times.
     * Boyer-Moore Voting Algorithm.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
```
