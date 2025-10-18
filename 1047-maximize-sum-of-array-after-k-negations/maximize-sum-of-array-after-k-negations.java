class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int i=0;
        Arrays.sort(nums);//sorting so that negative numbers if present comes forward 
        while(i<nums.length && k>0){//making all the negative numbers positive till k>0
            if(nums[i]<0){
                nums[i]*=-1;
                k--;
            }
                i++;
        }
        Arrays.sort(nums);//again sorting coz after making the negative positive the array doesnt remain sorted
        if(k%2==1)
        nums[0]=-nums[0];
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        return sum;
    }
}