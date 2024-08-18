using System;

class Solution
{
    public int Search(int[] nums, int target)
    {
        int pivot = 0;
        int len = nums.Length;

        if (len == 1 && target == nums[0])
        {
            return 0;
        }

        if (len <= 1 && target != nums[0])
        {
            return -1;
        }

        for (int i = 1; i < len; i++)
        {
            if (nums[i] < nums[pivot])
            {
                pivot = i;
            }
        }

        int low = pivot;
        int high = len - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            if (target < nums[mid]) high = mid - 1;

            else low = mid + 1;
        }

        int left = 0;
        int right = pivot;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            if (target < nums[mid]) right = mid - 1;

            else left = mid + 1;
        }

        return -1;
    }
}
