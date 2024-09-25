class Solution 
{
    public int maxVowels(String s, int k) 
    {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int maxVowelsCount = 0;
        int currentVowelsCount = 0;

        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowelsCount++;
            }
        }
        maxVowelsCount = currentVowelsCount;

        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            // Remove the character going out of the window
            if (vowels.contains(s.charAt(i - k))) {
                currentVowelsCount--;
            }
            // Add the character coming into the window
            if (vowels.contains(s.charAt(i))) {
                currentVowelsCount++;
            }
            // Update maxVowelsCount
            maxVowelsCount = Math.max(maxVowelsCount, currentVowelsCount);
        }

        return maxVowelsCount;
    }

    /*public static boolean isVowel(char p)
    {
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') return true;
        return false;
    }*/
}