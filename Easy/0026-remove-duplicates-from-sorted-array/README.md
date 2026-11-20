# 26. Remove Duplicates from Sorted Array

- **Difficulty:** **Easy**
- **Topics:** `Array` `Two Pointers`
- **LeetCode Link:** [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## Solution Description

Uses two pointers: one scanning the array (`i`) and one tracking the position for unique values (`writeIndex`).

## Java Solution

```java
class Solution {
    /**
     * Removes duplicates in-place from sorted array such that each unique element appears once.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int writeIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
```
