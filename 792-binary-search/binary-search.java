class Solution 
{
    public int search(int[] nums, int target)
    {
        int len = nums.length;
        int low = 0;
        int high = len-1;
        int mid;

        while(low <= high)
        {
            mid = low+(high-low)/2;
            
            if(nums[mid]>target)
            {
                high = mid-1;
            }

            if(nums[mid]<target)
            {
                low = mid+1;
            }
            
            if(nums[mid]==target)
            {
                return mid;
            }
        }
        return -1;
    }
}