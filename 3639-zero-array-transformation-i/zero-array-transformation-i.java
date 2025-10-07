class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        //0，0，0，0
        //-1,0,0,1
        //
        int n = nums.length;
        int[] record = new int[n + 1];
        for(int[]query: queries){
            record[query[0]] -= 1;
            record[query[1] + 1] += 1; 
        }

        int change = 0;

        for(int i = 0; i < n; i++){
            change += record[i];
            if(nums[i] + change > 0) return false;
        }
        return true;
    }
}