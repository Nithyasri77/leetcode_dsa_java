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
