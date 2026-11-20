# 1. Two Sum

- **Difficulty:** **Easy**
- **Topics:** `Array` `Hash Table`
- **LeetCode Link:** [Two Sum](https://leetcode.com/problems/two-sum/)

## Solution Description

Uses a HashMap to store the numbers and their indices in a single pass. For each element, checks if `target - nums[i]` exists in the map.

## Java Solution

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Finds indices of the two numbers such that they add up to target.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
```
