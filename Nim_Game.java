public class Nim_Game {
    public static void main(String[] args) {
        System.out.println(canWinNim(4)); // Expected: false
        System.out.println(canWinNim(1)); // Expected: true
        System.out.println(canWinNim(2)); // Expected: true
        System.out.println(canWinNim(8)); // Expected: false
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}