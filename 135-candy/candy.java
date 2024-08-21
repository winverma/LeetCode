class Solution 
{
    public int candy(int[] ratings) 
    {
        int len = ratings.length;
        int [] alloc = new int [len];

        for(int i = 0; i < len; i++)
        {
            alloc[i] = 1;
        }

        for(int i = 1; i < len; i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                alloc[i] = alloc[i-1]+1;
            }
        }

        for(int i = len-2; i>=0; i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                alloc[i] = Math.max(alloc[i],alloc[i+1]+1);
            }
        }

        int answer = 0;

        for(int i : alloc)
        {
            answer += i;
        }

        return answer;
    }
}