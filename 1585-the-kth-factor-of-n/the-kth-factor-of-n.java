class Solution {
    public int kthFactor(int n, int k) 
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=1; i<=n; i++)
        {
            if(n%i == 0 )
            {
                factors.add(i);
            }
        }
        if(k<=factors.size())
        {
            return factors.get(k-1);
        }
        else
        {
            return -1;
        }
    }
}