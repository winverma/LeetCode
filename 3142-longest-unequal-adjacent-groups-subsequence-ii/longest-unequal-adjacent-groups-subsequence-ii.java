class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        List<List<Integer>> lst = new ArrayList<>();
        int n = words.length;
        List<Integer> temp = new LinkedList<>();
        temp.add(0);
        lst.add(temp);
        List<Integer> mark = temp;
        List<String> res = new LinkedList<>();

        for (int i = 1; i < n; i++) {
            temp = new LinkedList<>();
            int max = 0;
            for (int j = 0; j < i; j++) {
                List<Integer> curr = lst.get(j);
                if (groups[j] != groups[i] && curr.size() > temp.size() && isDistanceOne(words[i], words[j])) {
                    temp = curr;
                }
            }
            temp = new LinkedList<>(temp);
            temp.add(i);
            lst.add(temp);

            if (temp.size() > mark.size())
                mark = temp;
        }

        for (int index : mark)
            res.add(words[index]);

        return res;
    }

    public boolean isDistanceOne(String a, String b) {
        if (a.length() != b.length())
            return false;

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                count += 1;

            if (count > 1)
                return false;
        }

        return true;
    }
}