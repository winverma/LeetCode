class Solution {

    private static final int MOD = 1_000_000_007;

    private int calcLength(char ch, int transforms, Integer[][] memo) {
        if (transforms <= 0) {
            return 1;
        }

        if (memo[ch - 'a'][transforms] != null) {
            return memo[ch - 'a'][transforms];
        }
        int lengthHere = 1;
        int diff = 'z' - ch;
        if (transforms - diff >= 1) {
            lengthHere = (calcLength('a', transforms - diff - 1, memo) + calcLength('b', transforms - diff - 1, memo)) % MOD;
        }
        return memo[ch - 'a'][transforms] = lengthHere;
    }

    public int lengthAfterTransformations(String s, int t) {
        if (t == 0) {
            return s.length();
        }

        Integer[][] memo = new Integer[26][t + 1];
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            ans = (ans + calcLength(s.charAt(i), t, memo)) % MOD;
        }
        return ans;
    }
}