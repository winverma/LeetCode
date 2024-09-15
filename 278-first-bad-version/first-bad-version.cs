/* The isBadVersion API is defined in the parent class VersionControl.
      bool IsBadVersion(int version); */

public class Solution : VersionControl 
{
    public int FirstBadVersion(int n) 
    {
        int answer = 0;
        int low = 0;
        int high = n;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(IsBadVersion(mid) == true)
            {
                high = mid-1;
                answer = mid;
            }
            else
            {
                low = mid+1;
            }
        }
        return answer;
    }
}