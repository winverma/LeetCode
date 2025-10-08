public class Solution {
    
    static final int MOD = 1_000_000_007;
    static final int MAX = 100_005;

    static long[] fact = new long[MAX];
    static long[] invFact = new long[MAX];
    static boolean precomputed = false;

    public int countGoodArrays(int n, int m, int k) {
        if (!precomputed) {
            precomputeFactorials();
        }

        long choose = comb(n - 1, k); // C(n-1, k)
        long pow = fastPow(m - 1, n - 1 - k); // (m - 1)^(n-1-k)
        long result = 1L * m * choose % MOD * pow % MOD;

        return (int) result;
    }

    // Precompute factorials and inverse factorials
    private void precomputeFactorials() {
        fact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        invFact[MAX - 1] = fastPow(fact[MAX - 1], MOD - 2);
        for (int i = MAX - 2; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }

        precomputed = true;
    }

    // Compute a^b % MOD
    private long fastPow(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }

    // Compute n choose k % MOD
    private long comb(int n, int k) {
        if (k < 0 || k > n) return 0;
        return fact[n] * invFact[k] % MOD * invFact[n - k] % MOD;
    }
}