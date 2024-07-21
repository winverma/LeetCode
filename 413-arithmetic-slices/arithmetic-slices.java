public class Solution 
{
    public int numberOfArithmeticSlices(int[] nums) 
    {
        int count = 0;
        int current = 0;
        int len = nums.length;

        if(len < 3)
        {
            return 0;
        }
        
        for(int i = 2; i < len; i++)
        {
            if(nums[i-1] - nums[i-2] == nums[i] - nums[i-1])
            {
                current++;
                count += current;
            }
            else
            {
                current = 0;
            }
        }

        return count;
    }
}
