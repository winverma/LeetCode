public class Solution 
{
    public int ArrangeCoins(int n) 
    {
        int i = 1;

        while(n>0)
        {
            i++;
            n -= i;
        }
        return i-1;        
    }
}