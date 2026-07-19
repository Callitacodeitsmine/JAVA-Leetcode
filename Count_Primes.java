public class Count_Primes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(0)); 
        System.out.println(countPrimes(1)); 
        System.out.println(countPrimes(30)); 
    }

    public static int countPrimes(int n) {
        if (n < 3) {
            return 0; // no primes less than 2 or 3
        }

        boolean[] isComposite = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;

                for (long j = (long) i * i; j < n; j += i) {
                    isComposite[(int) j] = true;
                }
            }
        }

        return count;
    }
}