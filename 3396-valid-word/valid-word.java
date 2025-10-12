// class Solution {
//    public boolean isValid(String word) {
//         if(word == null || word.length() < 2)
//             return false;
//         String vowel = "aeiou";
//         vowel += vowel.toUpperCase();
//         String consonents = "bcdfghjklmnpqrstvwxy";
//         String numbers = "0123456789";
//         String allowedCharacters = vowel + consonents + numbers;
//         boolean hasVowel = false; // have not seen any vowel yet
//         boolean hasConsonent = false; 
//         consonents += consonents.toUpperCase();
//         for(char c : word.toCharArray())
//         {
//             if(vowel.indexOf(c) > 0)
//             {
//                 hasVowel = true;
//             }
//             if(consonents.indexOf(c) > 0)
//             {
//                 hasConsonent = true;
//             }
//             if(allowedCharacters.indexOf(c) < 0)
//             {
//                 return false;
//             }
//         }
//         return hasVowel && hasConsonent;

//     }
// }

class Solution {
    public boolean isValid(String word) {
        // 1) Must be at least 3 characters long
        if (word == null || word.length() < 3) return false;

        boolean hasVowel = false;      // tracks if we saw a vowel (a,e,i,o,u)
        boolean hasConsonant = false;  // tracks if we saw a consonant (letter but not vowel)

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            // 2) All chars must be alphanumeric (no symbols like '-' '_' '@' etc.)
            if (!Character.isLetterOrDigit(c)) return false;

            // 3) Among letters, we must see at least one vowel and one consonant
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
            // Digits are allowed but don't affect vowel/consonant flags
        }

        // Valid iff we saw both a vowel and a consonant
        return hasVowel && hasConsonant;
    }

    private boolean isVowel(char c) {
        // Case-insensitive vowel check
        switch (Character.toLowerCase(c)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;
        }
    }
}