public class Solution 
{
    public int Candy(int[] ratings) 
    {
        int len = ratings.Length;
        int [] alloc = new int [len];

        // Initialize all elements in alloc to 1
        for(int i = 0; i < len; i++)
        {
            alloc[i] = 1;
        }

        // Left to right pass
        for(int i = 1; i < len; i++)  // Corrected loop condition
        {
            if(ratings[i] > ratings[i-1])
            {
                alloc[i] = alloc[i-1] + 1;
            }
        }

        // Right to left pass
        for(int i = len - 2; i >= 0; i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                alloc[i] = Math.Max(alloc[i], alloc[i+1] + 1);
            }
        }

        int answer = 0;

        // Summing up the total number of candies
        foreach(int i in alloc)
        {
            answer += i;
        }

        return answer;
    }
}