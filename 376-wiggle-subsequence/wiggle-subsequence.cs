public class Solution 
{
    public int WiggleMaxLength(int[] nums) 
    {
        int len = nums.Length;

        int diff = -1;
        int count = 1;

        for(int i = 0; i<len-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                if(diff == 1 || diff == -1)
                {
                    diff = 0;
                    count += 1;
                }
            }
            if(nums[i] < nums[i+1])
            {
                if(diff == 0 || diff == -1)
                {
                    diff = 1;
                    count += 1;
                }
            }
        }
        return count;
    }
}