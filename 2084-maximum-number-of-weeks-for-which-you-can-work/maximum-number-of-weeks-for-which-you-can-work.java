class Solution 
{
    public long numberOfWeeks(int[] milestones) 
    {
        int len = milestones.length;
        long sum = 0;
        long max = 0;
        long diff;

        for(int i : milestones)
        {
            sum += i;
            max = Math.max(max, i);
        }

        diff = sum-max;

        if(max-diff>1)
        {
            return sum-(max-diff-1);
        }
        return sum;
        
    }
}