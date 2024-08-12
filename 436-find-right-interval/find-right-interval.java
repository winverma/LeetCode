public class Solution 
{
    public int [] findRightInterval(int [] [] intervals) 
    {
        int n = intervals.length;
        int [] result = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < n; i++) 
        {
            map.put(intervals[i][0], i);
        }
        
        for (int i = 0; i < n; i++) 
        {
            Map.Entry<Integer, Integer> entry = map.ceilingEntry(intervals[i][1]);
            result[i] = (entry != null) ? entry.getValue() : -1;
        }
        
        return result;
    }
}
