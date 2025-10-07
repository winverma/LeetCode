class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int min=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE;
        for(int value:map.values()){
            if(value%2==0){
                min=Math.min(min,value);
            }else{
                max1=Math.max(max1,value);
            }
        }
        
        return max1-min;
    }
}