public class Solution 
{
    public int ThirdMax(int[] nums) 
    {
        SortedSet<int> set = new SortedSet<int>();

        foreach(int num in nums)
        {
            set.Add(num);
        }

        if (set.Count == 3) 
            return set.Min;

        else if (set.Count < 3) 
            return set.Max;

        else
        {
            List<int> list = new List<int>(set);
            return list[list.Count - 3];
        }
    }
}