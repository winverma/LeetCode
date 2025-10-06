class Solution 
{
    public int swimInWater(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        pq.offer(new int[]{0,0,grid[0][0]});
        boolean [][] vis = new boolean [n][m];
        int res = Integer.MAX_VALUE;
        vis[0][0] = true;
        int [][]dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!pq.isEmpty()) {
            final int [] curr = pq.poll();
            final int r = curr[0];
            final int c = curr[1];
            final int val = curr[2];
            if(r==n-1&&c==m-1){
                res = Math.min(val,res);
                continue;
            }
            for(int d[]:dir) {
                final int nr = d[0]+r;
                final int nc = d[1]+c;
                if(nr<0||nc<0||nr>=n||nc>=m||vis[nr][nc])continue;
                final int maxWall = Math.max(val,grid[nr][nc]);
                pq.offer(new int[]{nr,nc,maxWall});
                vis[nr][nc] = true;
            }
        }
        return res;
    }
}