class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans = new ArrayList<>();
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        int n = words.length;

        for (int i = 1; i < n; i++) {
            map.put(i, new HashSet<>());
        }

        String str = words[0];
        for (char ch : str.toCharArray()) {
            int count = 0;
            for (int i = 1; i < words.length; i++) {
                String s = words[i];
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch && !map.get(i).contains(j)) {
                        count++;
                        map.get(i).add(j); // track the index
                        break;  // found what we want
                    }
                }
            }
            if (count == n-1) ans.add(ch+"");
        }
        return ans;
    }
}