class Solution {
    public int differenceOfSums(int n, int m) {
        int div[] = new int[n];
        int idx1=0;
        int idx2=0;
        int sum =0;
        int dif =0;
        int not[] = new int[n];
        for(int i=1;i<=n;i++){
            if(i%m==0){
                div[idx1++]=i;
            }
            else{
                not[idx2++]=i;
            }
        }
        for(int num : div){
            sum+=num;
        }
        for(int num : not){
            dif+=num;
        }
        return dif-sum;
    }
}