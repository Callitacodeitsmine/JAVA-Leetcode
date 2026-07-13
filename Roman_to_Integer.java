import java.util.*;

public class Roman_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write Roman number to transfer into integer : ");
        String s = sc.next(); /* MCMXCIV */
        System.out.println(romanToInt(s));
        sc.close();
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = values.get(s.charAt(i));

            if (i + 1 < n && current < values.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }
}