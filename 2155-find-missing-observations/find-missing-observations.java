class Solution 
{
    public int[] missingRolls(int[] rolls, int mean, int n) 
    {
        int sum = 0;
        for(int i: rolls) sum += i;
        
        int totalSum = mean * (rolls.length + n);
        int missingSum = totalSum - sum;

        // Check if it's possible to distribute the missing sum
        if(missingSum < n || missingSum > n * 6) return new int[]{};

        int[] result = new int[n];
        Arrays.fill(result, missingSum / n);
        
        int remainder = missingSum % n;
        
        // Distribute the remainder to the first few elements
        for (int i = 0; i < remainder; i++) result[i]++;
        
        return result;
    }
}