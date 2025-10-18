class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
         // Step 1: find number of bits
        int mask = 0;
        int temp = n;

        // create mask with all bits = 1
        while (temp > 0) {
            mask = (mask << 1) | 1; // shift left and add 1
            temp >>= 1;             // right shift temp
        }

        // Step 2: XOR with mask
        return n ^ mask;
    }
}