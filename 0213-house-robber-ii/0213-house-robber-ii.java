class Solution {
    int[] dp = new int[101];

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        Arrays.fill(dp, -1);
        int ans1 = robing(nums, 0, nums.length - 1);

        Arrays.fill(dp, -1);
        int ans2 = robing(nums, 1, nums.length);

        return Math.max(ans1, ans2);
    }

    public int robing(int[] nums, int indx,int n) {
        if (indx >= n) return 0;

        if (dp[indx] != -1) return dp[indx];

        return dp[indx] = Math.max(
            nums[indx] + robing(nums, indx + 2,n),
            robing(nums, indx + 1,n)
        );
    }
}