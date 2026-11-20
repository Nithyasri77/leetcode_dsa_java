# 35. Search Insert Position

- **Difficulty:** **Easy**
- **Topics:** `Array` `Binary Search`
- **LeetCode Link:** [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

## Solution Description

Standard binary search. If target is not found, `left` points to the correct insertion index.

## Java Solution

```java
class Solution {
    /**
     * Returns the index if target is found, or index where it would be if inserted in order.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
```
