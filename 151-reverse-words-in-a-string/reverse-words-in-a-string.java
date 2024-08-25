class Solution 
{
    public String reverseWords(String s) 
    {
        String [] words = s.split("\\s+");
        int len = words.length;

        for(int i = 0; i<len/2; i++)
        {
            String temp = words[i];
            words[i] = words[len-1-i];
            words[len-i-1] = temp;
        }

        String output = String.join(" ",words);
        return output.trim();
    }
}