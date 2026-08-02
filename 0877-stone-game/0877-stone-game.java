class Solution {
    public boolean stoneGame(int[] piles) {
        int sum=0;
        int n=piles.length-1;
        for(int i=0;i<piles.length;i++){
            sum+=piles[i];
        }
        sum/=2;
        return dp(piles,sum,piles[0],1,n) || dp(piles,sum,piles[n],0,n-1);
    }
    public static boolean dp(int[] piles, int trg, int crr, int i, int j) {
    if (crr > trg) return true;
    if (i > j) return false;

    if (piles[i] > piles[j]) {
        return dp(piles, trg, crr + piles[i], i + 1, j);
    }

    return dp(piles, trg, crr + piles[j], i, j - 1);
}
}