class Solution 
{
    public int maxArea(int[] height) 
    {
        int low = 0;
        int high = height.length-1;
        int area = 0;

        while(low < high)
        {
            area = Math.max(Math.min(height[low], height[high]) * (high - low), area);

            if(height[low] < height[high]) low++;
            else high--;
        }

        return area;

        
    }
}