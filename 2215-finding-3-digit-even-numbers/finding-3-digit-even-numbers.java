class Solution 
{
    public int[] findEvenNumbers(int[] digits) 
    {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++; 
        }

        List<Integer> result = new ArrayList<>();

        for (int num = 100; num <= 999; num++) {
            if (num % 2 != 0)
                continue;

            int[] need = new int[10];
            int temp = num;
            // counting digits in this number..
            for (int i = 0; i < 3; i++) {
                need[temp % 10]++;
                temp /= 10;
            }

            boolean valid = true;
            for (int d = 0; d < 10; d++) {
                if (need[d] > freq[d]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        Arrays.sort(ans);

        return ans;
    }
}