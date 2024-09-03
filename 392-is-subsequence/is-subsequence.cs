public class Solution 
{
    public bool IsSubsequence(string s, string t) 
    {
        int i = 0;
        int j = 0;

        if(i == s.Length) return true;

        while(j < t.Length)
        {
            if(s[i] == t[j])
            {
                i++; j++;
                if(i == s.Length) return true;
            }
            else j++;
        }
        
        return false;
    }
}