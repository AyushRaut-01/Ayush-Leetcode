import java.util.Arrays;

class Solution {
    int[] dp = new int[101];

    public int rob(int[] nums) {
        Arrays.fill(dp, -1);
        return robing(nums, 0);
    }

    public int robing(int[] nums, int indx) {
        if (indx >= nums.length) return 0;

        if (dp[indx] != -1) return dp[indx];

        return dp[indx] = Math.max(
            nums[indx] + robing(nums, indx + 2),
            robing(nums, indx + 1)
        );
    }
}