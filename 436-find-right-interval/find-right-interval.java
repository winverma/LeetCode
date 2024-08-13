import java.util.*;

public class Solution 
{
    public int[] findRightInterval(int[][] intervals) 
    {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] result = new int[intervals.length];
        
        for (int i = 0; i < intervals.length; i++)
            map.put(intervals[i][0], i);
        
        Arrays.setAll(result, i -> map.ceilingEntry(intervals[i][1]) != null 
                                    ? map.ceilingEntry(intervals[i][1]).getValue() : -1);
        
        return result;
    }
}

