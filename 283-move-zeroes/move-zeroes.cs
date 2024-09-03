public class Solution 
{
    public void MoveZeroes(int[] nums) 
    {
        int len = nums.Length;
        int temp = 0;
        int pointer = 0;

        for(int i = 0; i<len; i++)
        {
            if(nums[i] != 0)
            {
                nums[pointer++] = nums[i];
            }
        }

        for(int i = pointer; i<len; i++)
        {
            nums[i] = 0;
        }

    }
}