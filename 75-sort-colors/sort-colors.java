class Solution 
{
    public void sortColors(int[] nums) 
    {
        quicksort(nums, 0, nums.length - 1);
    }

    private void quicksort(int[] nums, int low, int high) 
    {
        if (low < high) 
        {
            int pivot = nums[high];
            int i = low - 1;

            for (int j = low; j < high; j++) 
            {
                if (nums[j] <= pivot) {
                    i++;
                    // Swap elements
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

            // Swap the pivot element to its correct position
            int temp = nums[i + 1];
            nums[i + 1] = nums[high];
            nums[high] = temp;

            int pivotIndex = i + 1;

            // Recursively sort elements before and after partition
            quicksort(nums, low, pivotIndex - 1);
            quicksort(nums, pivotIndex + 1, high);
        }
    }
}