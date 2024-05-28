public class Solution 
{
    public int partitionString(String s) 
    {
        HashSet <Character> seen = new HashSet<Character>();
        int partition = 0;

        for(char ch : s.toCharArray())
        {
            if(seen.contains(ch))
            {
                partition++;
                seen.clear();
            }
            seen.add(ch);
        }
        return partition+1;

    }
}