public class Solution 
{
    public IList<bool> KidsWithCandies(int[] candies, int extraCandies) 
    {
        int len = candies.Length;
        int max = 0;
        Boolean [] result = new Boolean [len];

        for(int i = 0; i<len; i++)
        {
            if(max < candies[i])
            {
                max = candies[i];
            }
        }

        for(int i = 0; i<len; i++)
        {
            if(candies[i] + extraCandies >= max)
            {
                result[i] = true;
            }
            else
            {
                result[i] = false;
            }
        }
        return result;

    }
}