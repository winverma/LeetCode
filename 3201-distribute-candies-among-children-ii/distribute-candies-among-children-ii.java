class Solution {
    public long distributeCandies(int n, int limit) {
        long res=0;
        for(long i=0; i<=Math.min(limit,n); i++)
        {
            if(n-i<=2*limit)
            {
                long lowerLimitForSecondChild=Math.max(n-i-limit,0); //So that we don't consider negative numbers
                long upperLimitForSecondChild=Math.min(n-i,limit); //So that we don't consider more than limit
                res+=upperLimitForSecondChild-lowerLimitForSecondChild+1;
            }
        }
        return res;
    }
}