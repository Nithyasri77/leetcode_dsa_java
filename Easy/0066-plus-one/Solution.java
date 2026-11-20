class Solution {
    /**
     * Increments the large integer represented by digits by one.
     * Time Complexity: O(n)
     * Space Complexity: O(n) in worst case (e.g. 999 -> 1000), otherwise O(1)
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
