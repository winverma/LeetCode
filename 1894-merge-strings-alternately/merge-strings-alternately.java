class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
      var result = new char[word1.length() + word2.length()];
      var min = Math.min(word1.length(), word2.length());

      for (var i = 0; i < min; i++) 
      {
        result[2 * i] = word1.charAt(i);
        result[2 * i + 1] = word2.charAt(i);
      }

      String longer = word1.length() > word2.length() ? word1 : word2;

      for (var j = min; j < longer.length(); j++) 
      {
        result[min * 2 + j - min] = longer.charAt(j);
      }

      return new String(result);
    }
}