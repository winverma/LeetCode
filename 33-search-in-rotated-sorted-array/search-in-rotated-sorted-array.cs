public class Solution 
{
    public int Search(int[] nums, int target) 
    {
        int len = nums.Length;

        for(int i = 0; i<len; i++)
        {
            if(nums[i]==target) return i;
        }
        return -1;
    }
}