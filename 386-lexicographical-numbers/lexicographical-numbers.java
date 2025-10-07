class Solution {
    public List<Integer> lexicalOrder(int n) {

        List<Integer> ans = new ArrayList<>(n);

        int num = 1, count = 0;
        while (count < n) {
            ans.add(num);
            count++;
            if (num * 10 <= n) num *= 10;
            else {
                while (num % 10 == 9 || num == n) num /= 10;
                num++;
            }
        }

        return ans;
    }
}