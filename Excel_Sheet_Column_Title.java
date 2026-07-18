public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));    // Expected: A
        System.out.println(convertToTitle(28));   // Expected: AB
        System.out.println(convertToTitle(701));  // Expected: ZY
        System.out.println(convertToTitle(26));   // Expected: Z
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // shift to 0-indexed so 26 maps to 'Z', not wrapping to 'A' with a carry
            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}