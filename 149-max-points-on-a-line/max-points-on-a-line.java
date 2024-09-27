class Solution 
{
    public int maxPoints(int[][] points) 
    {
        int n = points.length;
        if(n == 1) return 1;

        int globalMax = 0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int sum = 0;

                for(int k=0; k<n; k++)
                {
                    if(isOnLine(points[i], points[j], points[k]))
                    {
                        sum++;
                    }
                }
                globalMax = Math.max(globalMax, sum);
            }
        }
        return globalMax;
    }
    
    public boolean isOnLine(int[] a, int[] b, int[] c)
    {
        return (b[1]-a[1])*(c[0]-a[0]) == (c[1]-a[1])*(b[0]-a[0]);
    }
}