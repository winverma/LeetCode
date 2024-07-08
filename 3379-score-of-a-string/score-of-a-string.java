class Solution 
{
    public int scoreOfString(String s) 
    {
        int absdiff = 0;
        int sum = 0;
        char [] each = s.toCharArray();
        for(int i = 0; i < each.length - 1; i++ )
        {
            absdiff = Math.abs(each[i] - each[i+1]);
            sum += absdiff;
        }
        return sum;
    }
}