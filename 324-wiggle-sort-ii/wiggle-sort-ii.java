class Solution 
{
    public void wiggleSort(int[] nums) 
    {
        int len = nums.length-1;

        int[] newarr = Arrays.copyOf(nums,nums.length);

        Arrays.sort(newarr);

        for(int i=1;i<nums.length;i+=2)
        {
            nums[i] = newarr[len--];
        }

        for(int i=0;i<nums.length;i+=2)
        {
            nums[i] = newarr[len--];
        }
    }
}