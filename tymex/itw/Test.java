package tymex.itw;

public class Test {

    public static int countSubsets(int n, int[] arr, int target) {
        int[][] dp = new int[n + 1][target + 1];

        dp[0][0] = 1;

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (arr[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10}; // Sample input array
        int sum = 10;  // Target sum
        int n = arr.length;

        int count = countSubsets(n, arr, sum);
        System.out.println("Number of subsets with sum " + sum + " is: " + count);
    }
}
