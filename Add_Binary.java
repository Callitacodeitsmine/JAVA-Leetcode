public class Add_Binary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));       // Expected: 100
        System.out.println(addBinary("1010", "1011"));  // Expected: 10101
        System.out.println(addBinary("0", "0"));        // Expected: 0
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}