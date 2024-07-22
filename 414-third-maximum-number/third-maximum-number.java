class Solution 
{
    public int thirdMax(int[] nums) 
    {
       SortedSet<Integer> set = new TreeSet<>();

       for(int i : nums) set.add(i);

       if(set.size() == 3) return set.first();

       else if(set.size() < 3) return set.last();

       else
       {
            List<Integer> list = new ArrayList<>(set);
            return list.get(list.size()-3);
       }
    }
}