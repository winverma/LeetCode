class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        int[] freq = new int[26];
        for(char c : s.toCharArray())
            freq[c-'a']+=1;
        
        Queue<String> q = new LinkedList<>();
        String res = "";
        String curr = "";
        q.offer(curr);

        while(q.size()!=0)
        {
              
              curr = q.poll();
              for(char c = 'a' ; c <='z' ; c++)
              {
                 if(freq[c-'a']<k)
                 {
                    continue;
                 }
                 String next = curr + c;
                 if(helper(next  , s) >= k)
                 {
                      res = next;
                      q.offer(next);
                 }
              }

        }
        return res;
        
    }


    public int helper(String next  , String s)
    {
        int i = 0;
        int j = 0 ;
        int m = next.length();
        int count_sub  =0;


        while(i < s.length())
        {
            if(s.charAt(i)==next.charAt(j))
            {
                j++;
            }
            if(j==m)
            {
                j = 0;
                count_sub++;

            }
            i++;
        }

        return count_sub;
    }
    
    
}
