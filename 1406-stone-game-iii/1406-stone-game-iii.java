class Solution {
    Integer[] dp;

    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        dp = new Integer[n];

        int diff = solve(stoneValue, 0);

        if (diff > 0)
            return "Alice";
        if (diff < 0)
            return "Bob";
        return "Tie";
    }

    private int solve(int[] nums, int i) {
        if (i >= nums.length)
            return 0;

        if (dp[i] != null)
            return dp[i];

        int sum = 0;
        int best = Integer.MIN_VALUE;

        for (int k = 0; k < 3 && i + k < nums.length; k++) {
            sum += nums[i + k];
            best = Math.max(best, sum - solve(nums, i + k + 1));
        }

        return dp[i] = best;
    }
}