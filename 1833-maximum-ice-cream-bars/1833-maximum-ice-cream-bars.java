class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int spent = 0;
        int ans = 0;

        for (int cost : costs) {
            if (spent + cost > coins) {
                break;
            }
            spent += cost;
            ans++;
        }

        return ans;
    }
}