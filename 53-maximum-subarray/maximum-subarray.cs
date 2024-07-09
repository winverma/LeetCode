class Solution 
{
    public int MaxSubArray(int[] nums) 
    {
        int len = nums.Length;
        int MaxSum = nums[0];
        int CurrentSum = nums[0];

        for(int i = 1; i < len; i++)
        {
            CurrentSum = Math.Max(nums[i], CurrentSum + nums[i]);
            MaxSum = Math.Max(MaxSum,CurrentSum);
        }
        return MaxSum;
    }
}