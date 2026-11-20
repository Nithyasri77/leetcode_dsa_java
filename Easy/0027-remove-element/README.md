# 27. Remove Element

- **Difficulty:** **Easy**
- **Topics:** `Array` `Two Pointers`
- **LeetCode Link:** [Remove Element](https://leetcode.com/problems/remove-element/)

## Solution Description

Two-pointer approach overwriting matching elements with valid numbers.

## Java Solution

```java
class Solution {
    /**
     * Removes all instances of val in-place and returns the new length.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int removeElement(int[] nums, int val) {
        int writeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
```
