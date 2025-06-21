package DSATASK;
public class Qube {
    public static int maxPathSum(int[][][] cube) {
        int n = cube.length;
        if (n == 0) return 0;
        int[][][] dp = new int[n][n][n];
        int[][][] prev = new int[n][n][n]; // To track the previous indices
        dp[0][0][0] = cube[0][0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == 0 && j == 0 && k == 0) continue;
                    int maxSum = 0;
                    int fromI = -1, fromJ = -1, fromK = -1;
                    if (i > 0 && dp[i - 1][j][k] > maxSum) {
                        maxSum = dp[i - 1][j][k];
                        fromI = i - 1;
                        fromJ = j;
                        fromK = k;
                    }
                    if (j > 0 && dp[i][j - 1][k] > maxSum) {
                        maxSum = dp[i][j - 1][k];
                        fromI = i;
                        fromJ = j - 1;
                        fromK = k;
                    }
                    if (k > 0 && dp[i][j][k - 1] > maxSum) {
                        maxSum = dp[i][j][k - 1];
                        fromI = i;
                        fromJ = j;
                        fromK = k - 1;
                    }
                    dp[i][j][k] = maxSum + cube[i][j][k];
                    prev[i][j][k] = fromI * n * n + fromJ * n + fromK; // Store the previous index as a single integer
                }
            }
        }
        // Backtrack to find the path
        int i = n - 1, j = n - 1, k = n - 1;
        System.out.println("Path to Maximum Sum:");
        while (i != 0 || j != 0 || k != 0) {
            System.out.printf("(%d, %d, %d) -> ", i, j, k);
            int prevIndex = prev[i][j][k];
            i = prevIndex / (n * n);
            j = (prevIndex / n) % n;
            k = prevIndex % n;

        }
        System.out.printf("(0, 0, 0)\n"); // Print the starting point
        return dp[n - 1][n - 1][n - 1];
    }
    public static void main(String[] args) {
        int[][][] cube = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                },
                {
                        {19, 20, 21},
                        {22, 23, 24},
                        {25, 26, 27}
                }
        };
        int result = maxPathSum(cube);
        System.out.println("Maximum Path Sum: " + result);
    }
}