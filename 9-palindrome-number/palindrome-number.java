class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int temp = reverse(x);
        
        if(temp == x) return true;

        return false;
    }

    public int reverse(int x)
    {
        int reverse = 0;

        while(x > 0)
        {
            reverse = reverse * 10 + x % 10;
            x = x/10; 
        }
        
        return reverse;
    }
}