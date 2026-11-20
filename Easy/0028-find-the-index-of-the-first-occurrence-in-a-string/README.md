# 28. Find the Index of the First Occurrence in a String

- **Difficulty:** **Easy**
- **Topics:** `Two Pointers` `String` `String Matching`
- **LeetCode Link:** [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Solution Description

Sliding window of length `needle.length()` checking for equality across `haystack`.

## Java Solution

```java
class Solution {
    /**
     * Returns the index of the first occurrence of needle in haystack, or -1.
     * Time Complexity: O((n - m + 1) * m)
     * Space Complexity: O(1)
     */
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if (nLen == 0) return 0;
        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
```
