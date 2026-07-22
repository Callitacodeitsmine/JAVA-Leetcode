public class Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2)); // Expected: 2
        System.out.println(climbStairs(3)); // Expected: 3
        System.out.println(climbStairs(5)); // Expected: 8
        System.out.println(climbStairs(1)); // Expected: 1
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev2 = 1, prev1 = 2;

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}