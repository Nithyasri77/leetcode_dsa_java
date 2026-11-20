# 1768. Merge Strings Alternately

- **Difficulty:** **Easy**
- **Topics:** `Two Pointers` `String`
- **LeetCode Link:** [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)

## Solution Description

Iterates up to the maximum length of both words, alternately appending characters to a StringBuilder.

## Java Solution

```java
class Solution {
    /**
     * Merges two strings alternately by appending characters in alternating order.
     * Time Complexity: O(m + n)
     * Space Complexity: O(m + n)
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, m = word1.length(), n = word2.length();
        while (i < m || i < n) {
            if (i < m) sb.append(word1.charAt(i));
            if (i < n) sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
```
