class Solution {

    public static int findLHS(int[] nums) {
     
    	int n = nums.length;
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	
    	for (int i = 0; i < n; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
    	
    	int ans =0;
    	
    	 for (int x : hm.keySet()) {
             if (hm.containsKey(x + 1)) {
                 ans = Math.max(ans, hm.get(x) + hm.get(x + 1));
             }
         }
    	 
    	 
    	 return ans;
    }
	
}