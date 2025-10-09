class Solution {
    public int longestSubsequence(String a, int k) {
        char[] s = a.toCharArray();

        int len = Integer.toBinaryString(k).length();
        int start = a.length() - len;
        if(start <= 0){
            return s.length;
        }

        String str = a.substring(start);
        int ans = 0;
        for (int i = 0; i < start; i++) {
            if(s[i] == '0')ans++;
        }

        if(Integer.parseInt(str, 2) > k){
            return ans+str.length()-1;
        }
        return ans+str.length();
    }
}
