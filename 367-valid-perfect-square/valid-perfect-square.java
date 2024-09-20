class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        if (num < 2) 
        {
            return true;
        }

        long guess = num / 2;

        while (guess * guess > num) 
        {
            guess = (guess + num / guess) / 2;
        }

        return guess * guess == num;
    }
}