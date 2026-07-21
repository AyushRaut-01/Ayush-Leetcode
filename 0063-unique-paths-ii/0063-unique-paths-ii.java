import java.util.Arrays;

class Solution {
    int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return travers(obstacleGrid, 0, 0);
    }

    public int travers(int[][] obstacleGrid, int i, int j) {

        if (i >= obstacleGrid.length || j >= obstacleGrid[0].length)
            return 0;

        if (obstacleGrid[i][j] == 1)
            return 0;


        if (i == obstacleGrid.length - 1 && j == obstacleGrid[0].length - 1)
            return 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        dp[i][j] = travers(obstacleGrid, i + 1, j)
                 + travers(obstacleGrid, i, j + 1);

        return dp[i][j];
    }
}