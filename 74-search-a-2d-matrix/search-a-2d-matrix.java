class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int low = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int high = (rows*cols) - 1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int pos = matrix[mid/cols][mid%cols];

            if(pos == target) return true;
            if(pos < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}