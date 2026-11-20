class Solution {
    /**
     * Determines whether n is an ugly number (prime factors limited to 2, 3, 5).
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
