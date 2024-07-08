class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int missing = nums.length;
        
        int rsum = (missing * (missing+1)) / 2;

        for (int i : nums)
        {
            rsum = rsum - i;
        }
        
        return rsum;
    }
}
