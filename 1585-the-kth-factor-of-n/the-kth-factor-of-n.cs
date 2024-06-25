class Solution 
{
    public int KthFactor(int n, int k) 
    {
        ArrayList factors = new ArrayList();
        for(int i=1; i<=n; i++)
        {
            if(n%i == 0 )
            {
                factors.Add(i);
            }
        }
        if(k<=factors.Count)
        {
            return (int)factors[k-1];
        }
        else
        {
            return -1;
        }
    }
}