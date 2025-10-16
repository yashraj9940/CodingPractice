// class Solution {
//     public boolean isPalindrome(String s) {

        // s = s.toLowerCase();
        // StringBuilder sb = new StringBuilder();

        // for(int i=0; i<s.length(); i++){
        //     if((s.charAt(i) >= 97 && s.charAt(i) <=122) || (s.charAt(i) >=48 && s.charAt(i)<=57) ){
        //         sb.append(s.charAt(i));
        //     }
        // }

        // for(int i=0; i<sb.length()/2; i++){
        //     if(sb.charAt(i) != sb.charAt(sb.length() - 1 - i)){
        //     return false;
        //     }
        // }
        // return true;


//         int left = 0, right = s.length() - 1;

//         while (left < right) {
//             // Skip non-alphanumeric characters
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//             }

//             // Compare characters (ignore case)
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;
//     }
// }




// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;

//         while (left < right) {
//             // Skip non-letter and non-digit characters
//             if (!Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//                 continue;
//             }
//             if (!Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//                 continue;
//             }

//             // Compare after converting both to lowercase
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;
//     }
// }



class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // skip non-alphanumeric from left
            if (!isAlphaNum(l)) {
                left++;
                continue;
            }

            // skip non-alphanumeric from right
            if (!isAlphaNum(r)) {
                right--;
                continue;
            }

            // compare lowercase versions
            if (toLower(l) != toLower(r)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Faster than Character.isLetterOrDigit()
    private boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    // Faster than Character.toLowerCase()
    private char toLower(char c) {
        return (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
    }
}
