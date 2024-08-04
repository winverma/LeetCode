import java.math.BigInteger;

class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        // Create BigInteger instances from the input strings
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        // Add the two BigInteger values
        BigInteger sum = n1.add(n2);

        // Convert the result back to a string and return it
        return sum.toString();   
    }
}
