class Solution 
{
    public int mySqrt(int x) 
    {
        if (x == 0) return 0;
        if (x > 0 && x < 2) return 1;

        long guess = x / 2;

        while (guess * guess > x) 
        {
            guess = (guess + x / guess) / 2;
        }

        return (int) guess;
    }
}