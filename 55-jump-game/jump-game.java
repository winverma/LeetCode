class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            if (i > maxReach) 
            {
                return false;  // If we can't reach this point, return false
            }
            
            maxReach = Math.max(maxReach, i + nums[i]);  // Update the maximum reachable index
            
            if (maxReach >= nums.length - 1) 
            {
                return true;  // If we can reach or go beyond the last index, return true
            }
        }
        
        return false;  // If the loop completes and we haven't returned true, return false
    }
}
