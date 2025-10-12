class Solution {
    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                int id = i - j;
                PriorityQueue<Integer> pq = map.computeIfAbsent(id, k -> {
                    if(k>=0) return new PriorityQueue<>(Collections.reverseOrder());
                    else return new PriorityQueue<>();
                });
                pq.offer(grid[i][j]);
            }
        }

        for (int i = 0; i<grid.length; i++) {
            for (int j = 0; j<grid[0].length; j++) {
                int id = i - j;
                grid[i][j] = map.get(id).poll();
            }
        }

        return grid;
    }
}