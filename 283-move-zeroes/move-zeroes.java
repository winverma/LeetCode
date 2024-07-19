class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        if (nums.length <= 1) 
        {
            return;
        }

        int index = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != 0) 
            {
                // Swap the current element with the element at the index position
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }
        }
    }
}
