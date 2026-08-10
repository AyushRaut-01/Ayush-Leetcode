class Solution {
    boolean[] dp;
    public boolean isSquare(int n) {
        dp=new boolean[n+1];
    int sqr = (int) Math.sqrt(n);
    return sqr * sqr == n;
    }
    public boolean winnerSquareGame(int n) {
        if(n==1 || isSquare(n)){
            return true;
        }
        return solve(n);
    }
   public boolean solve(int n) {
    if (n == 0) {
        return dp[n]=false;
    }
    if(dp[n]){
        return dp[n]; 
    }

    for (int i = 1; i * i <= n; i++) {
        int square = i * i;

        if (!solve(n - square)) {
            return dp[n]=true;
        }
    }

    return dp[n]= false;
}
}