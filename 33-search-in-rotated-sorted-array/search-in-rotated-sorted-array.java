import java.util.Arrays;

class Solution 
{
    public int search(int[] nums, int target) 
    {
        int len = nums.length;

        for(int i = 0; i<len; i++)
        {
            if(nums[i]==target) return i;
        }
        return -1;
    }
}