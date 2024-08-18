public class Solution {
    public int[] SearchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.Length-1;
        int [] len = new int [] {-1,-1};

        if(nums.Length == 1)
        {
            if(nums[0] == target)
            {
                return new int[]{0, 0};
            }
            return new int[]{-1, -1};
        }
        
        while(i <= j)
        {
            if(nums[i] != target)
            {
                i++;
            }
            if(nums[j] != target)
            {
                j--;
            }
            if(nums[i] == target && nums[j] == target)
            {
                len[0] = i;
                len[1] = j;
                break;
            }
        }
        return len;
    }
}