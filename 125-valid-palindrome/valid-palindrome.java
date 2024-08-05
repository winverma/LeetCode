class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder clean = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        String cleanedStr = clean.toString();
        String reversedStr = clean.reverse().toString();

        return cleanedStr.equals(reversedStr);
    }
}