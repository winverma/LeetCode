class Solution {
    public int findLucky(int[] arr) {
        int [] freq = new int[501];
        for(int i : arr){
            freq[i]++;
        }
        int ans = -1;
        for(int i=1; i<freq.length; i++){
            if(freq[i]==i)
            ans = i;
        }
        return ans;
    }
}