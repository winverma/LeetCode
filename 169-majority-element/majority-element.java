class Solution 
{
    public int majorityElement(int[] nums) 
    {
        Map<Integer, Integer> counts = new HashMap<>();
        
        int majorityCount = nums.length / 2;

        for (int num : nums) 
        {
            counts.put(num, counts.getOrDefault(num, 0) + 1);

            if (counts.get(num) > majorityCount) 
            {
                return num;
            }
        }

        return -1;
    }
}