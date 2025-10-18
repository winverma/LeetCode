class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int maxLength = 0;
        int zeros = 0;
        if(nums.length == k) return k;        
        while(right < nums.length){
            if(nums[right] == 0) {
                zeros++;
            }
            right++;
            while(zeros > k) {
                if(nums[left] == 0) {
                    zeros--; 
                }
                left++;
            }
            maxLength = Math.max(right - left, maxLength);
        }
        
        return maxLength;
    }
}