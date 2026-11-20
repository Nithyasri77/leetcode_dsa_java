class Solution {
    /**
     * Repeatedly adds all digits until the result has only one digit (Digital Root).
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}
