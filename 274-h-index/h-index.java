class Solution 
{
    public int hIndex(int[] citations) 
    {
        int hindex = 0;
        int len = citations.length;

        Arrays.sort(citations);

        for(int i = 0; i<len; i++)
        {
            {
                hindex = len-i;
                
                if(citations[i] >= hindex)
                {
                    return hindex;
                }
            }
        }
        return 0;
    }
}