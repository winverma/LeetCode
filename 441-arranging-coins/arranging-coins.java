class Solution 
{
    public int arrangeCoins(int n) 
    {
        long low  = 0;
        long high = n;

        while(low <= high)
        {
            long mid = low + (high-low)/2;
            long usedCoins = (mid*(mid+1))/2;

            if(usedCoins == n) return (int) mid;
            
            if(usedCoins < n) low = mid+1;

            else high = mid-1;
        }

        return (int) high;

    }
}