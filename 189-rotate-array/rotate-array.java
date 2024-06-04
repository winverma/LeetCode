class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int len = nums.length;
        int start = 0;
        
        k = k % len;
        int end = k;

        int rotated [] = new int [len];

        for(int i=len-k; i<len; i++)
        {
            rotated[start++] = nums[i];
        }

        for(int i=0; i<len-k; i++)
        {
            rotated[end++] = nums[i];
        }
        
        System.arraycopy(rotated,0,nums,0,len);
        
    }
}