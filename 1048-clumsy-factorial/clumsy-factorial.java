class Solution {
    public int clumsy(int n) {
        Stack<Integer> s = new Stack<>();
        s.push(n);
        n--;
        int index=0;
        int res=0;
        while(n>0){
            if(index%4==0){
                s.push(s.pop()*n);
            }
            else if(index%4==1){
                s.push(s.pop()/n);
            }
            else if(index%4==2){
                s.push(n);
            }
            else{
                s.push(-n);
            }
            n--;
            index++;
        }
        for(int sum : s){
            
            res +=sum;
        }
        return res; 
    }
}