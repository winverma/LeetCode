import java.util.HashMap;

class Solution {
    public static int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        int ans = 0;
        boolean used = false;

        for (String word : words) {
            if(!map.containsKey(word))continue;
            String s = word.charAt(1)+""+word.charAt(0);
            if(word.equals(s)){
                if(map.containsKey(word)){
                    int get = map.get(word);
                    if (get == 1 && !used) {
                        used = true;
                        ans+=2;
                    } else if(get == 2){
                        ans+=4;
                        map.remove(word);
                    } else if(get > 2){
                        ans+=4;
                        map.put(word, get-2);
                    }
                }
            } else if(map.containsKey(s)){
                int get1 = map.get(word);
                int get2 = map.get(s);
                if(get1 == 1)map.remove(word);
                else map.put(word, get1-1);
                if(get2 == 1)map.remove(s);
                else map.put(s, get2-1);
                ans+=4;
            }
        }
        return ans;
    }
}