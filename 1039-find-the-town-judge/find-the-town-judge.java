class Solution 
{
    public int findJudge(int n, int[][] trust) 
    {
        if(n < 1) return -1;
        if(n == 1 && trust.length == 0) return 1;

        int[] trustWho = new int[n];
        int[] beTrusted = new int[n];
        
        for(int i = 0 ; i < trust.length ; i++)
        {
            int[] edge = trust[i];
            ++trustWho[edge[0] - 1];
            ++beTrusted[edge[1] - 1];
        }

        for(int i = 0 ; i < n ; i++)
        {
            if(trustWho[i] == 0 && beTrusted[i] == n - 1) {return i + 1;}
        }
        return -1;
    }
}