class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int len = nums.length;
        int[] result = new int[len];
        int lpc = 1;

        // Left Product Calculation (LPC)
        result[0] = 1;
        for (int i = 1; i < len; i++) 
        {
            lpc *= nums[i-1];
            result[i] = lpc;
        }
        
        // Right Procduct Calculation (RPC)
        int rpc = 1;
        for(int i = len-1; i>=0; i--)
        {
            result[i] *= rpc;
            rpc *= nums[i];
        }

        return result;
    }
}

