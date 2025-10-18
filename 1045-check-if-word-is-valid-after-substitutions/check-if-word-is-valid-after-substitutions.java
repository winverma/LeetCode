class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
            int size = stack.size();
            if (size >= 3 && stack.get(size - 3) == 'a' &&
                    stack.get(size - 2) == 'b' && stack.get(size - 1) == 'c') {
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}