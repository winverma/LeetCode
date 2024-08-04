class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        // Initialize pointers, carry, and result
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        // Process each digit starting from the end
        while (i >= 0 || j >= 0 || carry != 0) 
        {
            // Get the current digits or 0 if out of bounds
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            
            // Calculate sum of digits and carry
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;  // Update carry for next digit
            result.append(sum % 10);  // Append the last digit of sum
            
            // Move to the next digits
            i--;
            j--;
        }
        
        // Reverse the result to get the final sum
        return result.reverse().toString();
    }
}
