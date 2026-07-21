public class Perfect_Number {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28)); // Expected: true
        System.out.println(checkPerfectNumber(7));  // Expected: false
        System.out.println(checkPerfectNumber(6));  // Expected: true
        System.out.println(checkPerfectNumber(1));  // Expected: false
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; (long) i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                int complement = num / i;
                if (complement != i) {
                    sum += complement;
                }
            }
        }

        return sum == num;
    }
}