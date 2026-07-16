public class Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));   // Expected: 1024.0
        System.out.println(myPow(2.10000, 3));    // Expected: 9.261
        System.out.println(myPow(2.00000, -2));   // Expected: 0.25
    }

    public static double myPow(double x, int n) {
        long N = n; // widen to long to safely handle -Integer.MIN_VALUE

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = fastPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}