public class Base_7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100)); // Expected: 202
        System.out.println(convertToBase7(-7));  // Expected: -10
        System.out.println(convertToBase7(0));   // Expected: 0
    }

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;
        long n = Math.abs((long) num);

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 7);
            n /= 7;
        }

        if (negative) {
            sb.append('-');
        }

        return sb.reverse().toString();
    }
}