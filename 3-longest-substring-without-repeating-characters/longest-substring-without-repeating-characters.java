class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        if (s == null || s.length() == 0) 
        {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) 
        {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) 
            {
                // Update the left pointer to right of the last occurrence of the currentChsr
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the latest position of the current character
            map.put(currentChar, right);

            // Calculate the length of the current window and update maxLength if needed
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}