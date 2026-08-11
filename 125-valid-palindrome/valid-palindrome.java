class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) return true;

        int i = 0, j = s.length() - 1;
        while (i < j) {
            // Skip non-alphanumeric from left
            while (i < j && !valid(s.charAt(i))) i++;
            // Skip non-alphanumeric from right
            while (i < j && !valid(s.charAt(j))) j--;

            // Compare lowercase characters
            char left = toLower(s.charAt(i));
            char right = toLower(s.charAt(j));
            if (left != right) return false;

            i++;
            j--;
        }
        return true;
    }

    // Custom alphanumeric check
    private boolean valid(char a) {
        return (a >= 'a' && a <= 'z') ||
               (a >= 'A' && a <= 'Z') ||
               (a >= '0' && a <= '9');
    }

    // Custom lowercase conversion
    private char toLower(char a) {
        if (a >= 'A' && a <= 'Z') {
            return (char)(a - 'A' + 'a');
        }
        return a;
    }
}
