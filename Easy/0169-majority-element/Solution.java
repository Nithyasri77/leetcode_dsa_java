class Solution {
    /**
     * Finds the majority element that appears more than ⌊n / 2⌋ times.
     * Boyer-Moore Voting Algorithm.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
