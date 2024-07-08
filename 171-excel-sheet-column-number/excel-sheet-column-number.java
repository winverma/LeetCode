class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        int len = columnTitle.length();
        int sum = 0;
        int value = 0;

        char [] chars = columnTitle.toCharArray();

        for (char c : chars) 
        {
            value = c - 'A' + 1;
            sum = sum * 26 + value;
        }
        return sum;
    }
}