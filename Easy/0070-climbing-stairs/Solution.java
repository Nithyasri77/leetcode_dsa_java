class Solution {
    /**
     * Computes distinct ways to climb n stairs taking 1 or 2 steps each time.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
