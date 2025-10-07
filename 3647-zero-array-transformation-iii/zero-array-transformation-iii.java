class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        // Sort queries bases on start point
        Arrays.sort(queries, (a,b)->a[0]-b[0]);
        PriorityQueue<Integer> availablePool = new PriorityQueue<>((a,b)->b-a); //maxHeap;
        PriorityQueue<Integer> usedPool = new PriorityQueue<>((a,b)->a-b); //minHeap;

         int count = 0;
        for(int i=0, j=0; i<nums.length; i++){
            int num = nums[i];
            // push all queries with starting point matches with index i to the available pool
            while(j<queries.length && queries[j][0]==i){
                availablePool.add(queries[j][1]);
                j++;
            }

            num = num - usedPool.size();
            // if no.of queries in usedPool is not sufficient, transfer availablePool queries to usedPool and use it. 
            while(num>0 && !availablePool.isEmpty() && availablePool.peek() >= i){
                usedPool.add(availablePool.peek());
                availablePool.poll();
                num--;
                count++;
            }

            // if no queries available in usedPool and availablePool, return -1
            if(num>0) return -1;

            // expire all queries ending with i
            while(!usedPool.isEmpty() && usedPool.peek()==i) usedPool.poll();
        }
        return queries.length - count;
    }
}