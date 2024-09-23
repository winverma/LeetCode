class Solution 
{
    public int arrangeCoins(int n) 
    {
        /*

        1 + 2 + 3 + ... + x = n
        (1 + x) * x / 2 = n

        x^2 + x = 2n

        x^2 + x + 1/4 = 2n + 1/4

        (x + 1/2)^2 = 2n + 1/4

        x + 0.5 = sqrt(2n + 0.25)

        x = sqrt(2n + 0.25) - 0.5

        */
        
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