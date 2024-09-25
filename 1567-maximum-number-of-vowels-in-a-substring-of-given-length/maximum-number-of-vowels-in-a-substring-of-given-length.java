class Solution 
{
    public int maxVowels(String s, int k) 
    {
        int len = s.length();
        char [] chars = s.toCharArray();

        int sum = 0;

        for(int i = 0; i <= k-1; i++)
        {
            sum += isVowel(chars[i])? 1:0;
        }
        
        int max = sum;

        for(int i = k; i<len; i++)
        {
            sum -= isVowel(chars[i-k])? 1:0;
            sum += isVowel(chars[i])? 1:0;
            
            max = Math.max(max, sum);
        }
        return max;
    }

    public static boolean isVowel(char p)
    {
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') return true;
        return false;
    }
}