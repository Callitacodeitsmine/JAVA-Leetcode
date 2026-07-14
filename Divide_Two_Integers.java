public class Divide_Two_Integers {
    public static void main(String[] args) {
        int dividend = 10, divisor = 3;
        System.out.println(divide(dividend, divisor)); // Expected: 3

        System.out.println(divide(7, -3));   // Expected: -2
        System.out.println(divide(Integer.MIN_VALUE, -1)); // Expected: 2147483647
    }

    public static int divide(int dividend, int divisor) {
       if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        long result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;

           while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }

        result = negative ? -result : result;

       if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }
}