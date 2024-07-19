class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        if(nums.length <= 1)
        {
            return;
        }
        
        int index = 0;

        if(nums.length > 1)
        {
            for(int num : nums)
            {
                if(num != 0)
                {
                    nums[index++] = num;
                }
            }         
        }

        for(int i = index; i<nums.length; i++)
        {
            nums[i] = 0;
        }
    }
}