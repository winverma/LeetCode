class Solution 
{
    public int findMin(int[] nums) 
    {
        int min = 0;
        int len = nums.length;

        for(int i = 1; i < len; i++ )
        {
            if(nums[i] < nums[min])
            {
                min = i;
            }
        }
        
        return nums[min];
    }
}