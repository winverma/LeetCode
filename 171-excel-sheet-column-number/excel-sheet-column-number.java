class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        int len = columnTitle.length();
        int sum = 0;
        int value = 0;

        for (int i = 0; i < len; i++) 
        {
            char c = columnTitle.charAt(i);
            value = c - 'A' + 1;
            sum = sum * 26 + value;
        }
        return sum;
    }
}