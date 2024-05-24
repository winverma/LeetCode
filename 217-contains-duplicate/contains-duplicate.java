class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}