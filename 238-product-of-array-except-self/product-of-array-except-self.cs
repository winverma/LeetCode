public class Solution 
{
    public int[] ProductExceptSelf(int[] nums) 
    {
        int len = nums.Length;
        int [] answer = new int [len];
        answer[0] = 1;
        
        int lpc = 1;
        for(int i = 1; i<len; i++)
        {
            lpc *= nums[i-1];
            answer[i] = lpc;
        }
        
        int rpc = 1;
        for(int i = len-1; i > 0; i--)
        {
            rpc *= nums[i];
            answer[i-1] *= rpc; 
        }

        return answer;
    }
}