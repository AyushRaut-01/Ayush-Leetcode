class Solution {

    Boolean[][] dp;

    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int num : nums)
            sum += num;

        if (sum % 2 != 0)
             return false;

        dp = new Boolean[nums.length][sum / 2 + 1];

        return findpartition(nums, 0, sum / 2);
    }

    public boolean findpartition(int[] nums, int indx, int sum) {

        if (sum == 0)
            return true;

        if (indx == nums.length || sum < 0)
            return false;

        if (dp[indx][sum] != null)
            return dp[indx][sum];

        boolean take = findpartition(nums, indx + 1, sum - nums[indx]);
        boolean notTake = findpartition(nums, indx + 1, sum);

        return dp[indx][sum] = take || notTake;
    }
}