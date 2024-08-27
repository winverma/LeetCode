class Solution 
{
    public int singleNumber(int[] nums) 
    {
        return singleNumberA2(nums);
    }

    public int singleNumberA2(int[] nums) 
    {
        int ones = 0;
        int twice = 0;

        for(int num : nums)
        {
            ones = (ones^num) & (~twice);
            twice = (twice^num) & (~ones);
        }

        return ones;
    }

    public int singleNumberA1(int[] nums) 
    {
        int ans = 0;

        for(int i = 0; i < 32; i++)
        {
            int count = 0;

            for(int num : nums)
            {
                if((num&(1<<i)) != 0) count++;
            }

            if(count%3 != 0) ans |= (1<<i);
        }

        return ans;
    }
}