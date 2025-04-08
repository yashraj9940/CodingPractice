class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        int ind=word.indexOf(ch);
        if(ind == -1) return word;
        

        for (int i=0;i<=ind;i++){
                stack.push(word.charAt(i));
        }

        int k=0;
        StringBuilder sb = new StringBuilder(word);
        while(!stack.isEmpty()){
            sb.setCharAt(k, stack.pop());
            k++;
        }
        return sb.toString();
        
    }

}