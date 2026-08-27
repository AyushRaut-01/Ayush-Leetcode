class Solution {

    int[] dp;

    public int coinChange(int[] coins, int amount) {

        dp = new int[amount + 1];

        return solve(coins, amount);
    }

    int solve(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }

        if (dp[amount] != 0) {
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {

            if (coin <= amount) {

                int x = solve(coins, amount - coin);

                if (x != -1) {
                    min = Math.min(min, x + 1);
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            dp[amount] = -1;
        } else {
            dp[amount] = min;
        }

        return dp[amount];
    }
}