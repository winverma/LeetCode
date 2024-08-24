class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int len = candies.length;
        int max = 0;
        List<Boolean> result = new ArrayList<>();

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
                result.add(i, true);
            }
            else
            {
                result.add(i, false);
            }
        }
        return result;
    }
}