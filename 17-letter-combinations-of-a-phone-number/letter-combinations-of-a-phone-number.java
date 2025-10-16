class Solution {
    // Mapping digits to corresponding letters
    private static final String[] KEYPAD = {
        "",    "",    "abc", "def", "ghi", "jkl",
        "mno", "pqrs","tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder path, List<String> result) {
        // Base case: if we've used all digits, add the combination
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        // Get the letters for the current digit
        String letters = KEYPAD[digits.charAt(index) - '0'];

        // Try each letter and recurse
        for (char c : letters.toCharArray()) {
            path.append(c);                        // choose
            backtrack(digits, index + 1, path, result); // explore
            path.deleteCharAt(path.length() - 1);  // un-choose (backtrack)
        }
    }
}