import java.util.Arrays;

public class Perfect_Squares {
    public static void main(String[] args) {
        System.out.println(numSquares(12)); // Expected: 3
        System.out.println(numSquares(13)); // Expected: 2
        System.out.println(numSquares(1));  // Expected: 1
        System.out.println(numSquares(4));  // Expected: 1
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // base case: 0 requires 0 perfect squares

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                dp[i] = Math.min(dp[i], dp[i - square] + 1);
            }
        }

        return dp[n];
    }
}