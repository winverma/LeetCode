class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        boolean[] valid = new boolean[n];

        for (int j = 0; j < n; j++) {
            if (nums[j] == key) {
                int start = Math.max(0, j - k);
                int end = Math.min(n - 1, j + k);
                for (int i = start; i <= end; i++) {
                    valid[i] = true;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (valid[i]) {
                result.add(i);
            }
        }

        return result;
    }
}