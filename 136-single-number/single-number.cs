public class Solution 
{
    public int SingleNumber(int[] nums) 
    {
        int len = nums.Length;
        int result = 0;;


        for(int i = 0; i < len; i++)
        {
            result = result^nums[i];
        }
        return result;     
    }
}