public class Sqrt_x {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1));
    }

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 1, right = x / 2;
        long result = 1;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) result;
    }
}