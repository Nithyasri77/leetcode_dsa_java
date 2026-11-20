# 58. Length of Last Word

- **Difficulty:** **Easy**
- **Topics:** `String`
- **LeetCode Link:** [Length of Last Word](https://leetcode.com/problems/length-of-last-word/)

## Solution Description

Iterates from the end of the string, skips trailing spaces, and counts the characters until the next space.

## Java Solution

```java
class Solution {
    /**
     * Returns the length of the last word in the string.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
```
