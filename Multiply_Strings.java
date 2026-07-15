public class Multiply_Strings {
    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));       
        System.out.println(multiply("123", "456"));    
        System.out.println(multiply("0", "12345"));   
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';

            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int lowPos = i + j + 1;
                int highPos = i + j;

                int sum = product + result[lowPos];

                result[lowPos] = sum % 10;
                result[highPos] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}