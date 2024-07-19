class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        int len = s.length();
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;  // Base case: empty string

        // Iterate through the string
        for (int i = 1; i <= len; i++) {
            // Check all possible prefixes
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;  // No need to check further if dp[i] is true
                }
            }
        }

        return dp[len];
    }
}